package kr.co.yjglogitech.androiddesignpattern;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern.AdaterImpl;
import kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern.Duck;
import kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern.IAdapter;
import kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern.MallarDuck;
import kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern.TurykeyAdapter;
import kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern.WildTurky;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lyder on 2017-04-25.
 */

public class Ch02_AdapterTest {

    @Test
    public void adapterTest01(){
        //요구사항을 수행하는 인스턴스
        IAdapter target = new AdaterImpl();
        float num = 100;
        double num1 = 200;
        double num2 = 50;

        assertEquals(num1, target.twiceOf(num));
        assertEquals(num2, target.halfOf(num));
    }

    @Test
    public void adapterTest02(){
        //요구사항을 수행하는 인스턴스
        IAdapter target = new AdaterImpl();
        float num = 100.0124f;
        double num1 = 200.0248d;
        double num2 = 50.0062d;

        assertEquals(num1, target.twiceOf(num));
        assertEquals(num2, target.halfOf(num));
    }

    @Test
    public void adapterTest03(){
//        한 클래스의 인터페이스를 클라이언트에서 사용하고자하는 다른 인터페이스로 변환한다.
//        어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다.
        String mallarDuckSaying = "Quack";
        String mallarDuckFlying = "I'm flying";

        String turkeyDuckSaying = "Gobble gobble";
        String turkeyDuckFlying = "I'm flying a short distance";

        MallarDuck duck = new MallarDuck();
        WildTurky turkey = new WildTurky();
        Duck turkeyAdapter = new TurykeyAdapter(turkey);

        assertEquals(mallarDuckSaying, duck.quack());
        assertEquals(mallarDuckFlying, duck.fly());

        assertEquals(turkeyDuckSaying, turkey.gobble());
        assertEquals(turkeyDuckFlying, turkey.fly());


        assertEquals(mallarDuckSaying, testSayDuck(duck));
        assertEquals(mallarDuckFlying, testFlyDuck(duck));

//        assertEquals(turkeyDuckSaying, testSayDuck(turkeyAdapter));
//        assertEquals(turkeyDuckFlying, testFlyDuck(turkeyAdapter));
    }


    public static String testSayDuck(Duck duck){
        return duck.quack();
    }

    public static String testFlyDuck(Duck duck){
        return duck.fly();
    }
}
