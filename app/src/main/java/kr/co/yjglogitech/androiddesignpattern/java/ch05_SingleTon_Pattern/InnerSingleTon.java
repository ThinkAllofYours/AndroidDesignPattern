package kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern;

/**
 * Created by lyder on 2017-05-10.
 */

public class InnerSingleTon {
    private InnerSingleTon() {}
    private static class Singleton{
        private static final  InnerSingleTon instance = new InnerSingleTon();
    }

    public static InnerSingleTon getInstance(){
        return Singleton.instance;
    }
}
