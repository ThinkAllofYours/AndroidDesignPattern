package kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern;

/**
 * Created by lyder on 2017-04-28.
 */

public class MallarDuck implements Duck{
    @Override
    public String quack() {
        return "Quack";
    }

    @Override
    public String fly() {
        return "I'm flying";
    }
}
