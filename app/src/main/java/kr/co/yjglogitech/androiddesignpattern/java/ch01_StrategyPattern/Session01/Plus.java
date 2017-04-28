package kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01;

/**
 * Created by lyder on 2017-04-25.
 */

public class Plus implements ICalculate {
    @Override
    public int Calculate(int val1, int val2) {
        return val1 + val2;
    }
}
