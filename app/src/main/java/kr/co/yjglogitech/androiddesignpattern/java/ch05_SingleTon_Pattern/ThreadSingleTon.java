package kr.co.yjglogitech.androiddesignpattern.java.ch05_SingleTon_Pattern;

/**
 * Created by lyder on 2017-05-10.
 */

public class ThreadSingleTon {

    private static ThreadSingleTon instance;
    private ThreadSingleTon(){}

    public static synchronized ThreadSingleTon getInstance(){
        if(instance == null)
            instance = new ThreadSingleTon();
        return instance;
    }
}
