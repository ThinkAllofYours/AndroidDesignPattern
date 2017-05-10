package kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern;

/**
 * Created by lyder on 2017-05-10.
 */

public class SingleTon {

    //new SingleTon();
    //출처 : https://blog.seotory.com/post/2016/03/java-singleton-pattern
    //으로 인해 클래스가 load 되는 시점에 인스턴스를 생성시키는데 이는 시스템의 관점에서 부담스러울 수 있다.

    private static final SingleTon ourInstance = new SingleTon();

    public static SingleTon getInstance() {
        return ourInstance;
    }

    private SingleTon() {

    }

    @Override
    public String toString() {
        return "singleTon Pattern it work";
    }
}
