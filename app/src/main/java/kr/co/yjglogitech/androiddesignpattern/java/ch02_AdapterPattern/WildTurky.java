package kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern;

/**
 * Created by lyder on 2017-04-28.
 */

public class WildTurky implements Turkey {

    @Override
    public String gobble() {
        return "Gobble gobble";
    }

    @Override
    public String fly() {
        return "I'm flying a short distance";
    }
}
