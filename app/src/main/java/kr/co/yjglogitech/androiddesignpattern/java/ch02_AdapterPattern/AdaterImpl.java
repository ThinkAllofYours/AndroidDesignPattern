package kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern;

/**
 * Created by lyder on 2017-04-27.
 */

public class AdaterImpl implements IAdapter {

    @Override
    public double twiceOf(Float num) {
//        return Math.twiceNum(Double.parseDouble(num.toString()));
        return Math.twiceNum(num.doubleValue());
    }

    @Override
    public double halfOf(Float num) {
//        return Math.halfNum(Double.parseDouble(num.toString()));
        return Math.halfNum(num.doubleValue());
    }
}
