package kr.co.yjglogitech.androiddesignpattern;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern.EnumSingleTon;
import kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern.LazySingleTon;
import kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern.SingleTon;
import kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern.StaticSingleTon;
import kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern.ThreadSingleTon;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lyder on 2017-05-10.
 */

public class Ch05_SingletonTest {

    ArrayList<String> threadTest1 = new ArrayList<String>();
    ArrayList<String> threadTest2 = new ArrayList<String>();

    @Test
    public void basicSingleTonTest(){
        SingleTon _singleton = SingleTon.getInstance();
        assertEquals("singleTon Pattern it work", _singleton.toString());
    }

    @Test
    public void staticSingleTonTest(){
        StaticSingleTon _staticSingleTon = StaticSingleTon.getInstance();
        assertEquals("singleTon Pattern it work", _staticSingleTon.toString());
    }

    @Test
    public void lazySingleTonTest(){
        LazySingleTon _lazySingleTon = LazySingleTon.getInstance();
        assertEquals("singleTon Pattern it work", _lazySingleTon.toString());
    }

    @Test
    public void threadSingleTonTest1(){
        ThreadTest1 t1_1 = new ThreadTest1();
        ThreadTest1 t1_2 = new ThreadTest1();
        ThreadTest1 t1_3 = new ThreadTest1();
        ThreadTest1 t1_4 = new ThreadTest1();
        ThreadTest1 t1_5 = new ThreadTest1();

        ThreadTest2 t2_1 = new ThreadTest2();
        ThreadTest2 t2_2 = new ThreadTest2();
        ThreadTest2 t2_3 = new ThreadTest2();
        ThreadTest2 t2_4 = new ThreadTest2();
        ThreadTest2 t2_5 = new ThreadTest2();

        Thread _t1_1 = new Thread(t1_1);
        Thread _t1_2 = new Thread(t1_2);
        Thread _t1_3 = new Thread(t1_3);
        Thread _t1_4 = new Thread(t1_4);
        Thread _t1_5 = new Thread(t1_5);

        Thread _t2_1 = new Thread(t2_1);
        Thread _t2_2 = new Thread(t2_2);
        Thread _t2_3 = new Thread(t2_3);
        Thread _t2_4 = new Thread(t2_4);
        Thread _t2_5 = new Thread(t2_5);

        _t1_1.start();
        _t1_2.start();
        _t1_3.start();
        _t1_4.start();
        _t1_5.start();
        _t2_1.start();
        _t2_2.start();
        _t2_3.start();
        _t2_4.start();
        _t2_5.start();


        assertEquals(threadTest1, threadTest2);
    }

    class ThreadTest1 implements Runnable{
        @Override
        public void run() {
                LazySingleTon _lazySingleTon = LazySingleTon.getInstance();
                threadTest1.add(Integer.toHexString(_lazySingleTon.hashCode()));
        }
    }


    class ThreadTest2 implements Runnable{

        @Override
        public void run() {
            LazySingleTon _lazySingleTon = LazySingleTon.getInstance();
            threadTest2.add(Integer.toHexString(_lazySingleTon.hashCode()));
        }
    }

    @Test
    public void threadSingleTonTest2(){
        long start = System.currentTimeMillis() ;

        Runnable t1_1 = new ThreadTest1_1();
        Runnable t1_2 = new ThreadTest1_1();
        Runnable t1_3 = new ThreadTest1_1();
        Runnable t1_4 = new ThreadTest1_1();
        Runnable t1_5 = new ThreadTest1_1();

        Runnable t2_1 = new ThreadTest2_1();
        Runnable t2_2 = new ThreadTest2_1();
        Runnable t2_3 = new ThreadTest2_1();
        Runnable t2_4 = new ThreadTest2_1();
        Runnable t2_5 = new ThreadTest2_1();

        Thread _t1_1 = new Thread(t1_1);
        Thread _t1_2 = new Thread(t1_2);
        Thread _t1_3 = new Thread(t1_3);
        Thread _t1_4 = new Thread(t1_4);
        Thread _t1_5 = new Thread(t1_5);

        Thread _t2_1 = new Thread(t2_1);
        Thread _t2_2 = new Thread(t2_2);
        Thread _t2_3 = new Thread(t2_3);
        Thread _t2_4 = new Thread(t2_4);
        Thread _t2_5 = new Thread(t2_5);

        _t1_1.start();
        _t1_2.start();
        _t1_3.start();
        _t1_4.start();
        _t1_5.start();
        _t2_1.start();
        _t2_2.start();
        _t2_3.start();
        _t2_4.start();
        _t2_5.start();


        assertEquals(threadTest1, threadTest2);
        long end = System.currentTimeMillis();
        System.out.println((end-start) + "걸림");
    }

    class ThreadTest1_1 implements Runnable{
        @Override
        public void run() {
            ThreadSingleTon _threadSingleTon = ThreadSingleTon.getInstance();
            threadTest1.add(Integer.toHexString(_threadSingleTon.hashCode()));
        }
    }


    class ThreadTest2_1 implements Runnable{
        @Override
        public void run() {
            ThreadSingleTon _threadSingleTon = ThreadSingleTon.getInstance();
            threadTest2.add(Integer.toHexString(_threadSingleTon.hashCode()));
        }
    }

    @Test
    public void enumSingleTonTest(){
        EnumSingleTon.getInstance();
        assertEquals("singleTon Pattern it work",EnumSingleTon.INSTANCE.test );
    }

    @Test
    public void _UsingReflectionToDestroySingletonTest(){
        /**
         * 위의 코드를 실행해보면 아래
         * System.out.println();의 두 라인에서 찍히는 hachCode()값이 다른 것을 확인 할 수 있다.
         * java의 reflection은 매우 강력하다.
         * 설령 class 의 생성자가 private 일지라도 강제로 가져와서 새로운 인스턴스 생성이 가능하다.
         * 결국 singleton pattern을 깨뜨리는 것이다.
         * 이 외에도 reflection을 여러곳에서 사용할 수 있으니 알아두는 것이 좋다.
         *
         *
         */
        LazySingleTon instance = LazySingleTon.getInstance();
        LazySingleTon instance2 = null;

        try {
            Constructor[] constructors = LazySingleTon.class.getDeclaredConstructors();
            for ( Constructor constructor : constructors ) {
                constructor.setAccessible(true);
                instance2 = (LazySingleTon)constructor.newInstance();
            }
        } catch (Exception e) {

        }

        assertEquals(instance.hashCode(), instance2.hashCode());

    }


}
