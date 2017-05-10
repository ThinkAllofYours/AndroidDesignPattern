package kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern;

/**
 * Created by lyder on 2017-05-10.
 */

public class LazySingleTon {
    /**
     * 출처 : https://blog.seotory.com/post/2016/03/java-singleton-pattern
     * 최초 사용시점에만 인스턴스화 시키기 때문에 프로그램이 메모리에 적재되는 시점에 부담이 많이 줄게된다.
     * 만약 프로그램이 muilti thread 방식이라면 위와 같은 singleton pattern은 안전하지 않다.
     * 동일 시점에 getInstance() method를 호출하면 인스턴스가 두번 생길 위험이 있다.
     */

    private static LazySingleTon instance;
    private LazySingleTon() {}

    public static LazySingleTon getInstance(){
        if( instance == null)
            instance = new LazySingleTon();
        return instance;
    }

}

