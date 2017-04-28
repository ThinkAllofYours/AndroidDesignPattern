package kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01;

/**
 * Created by lyder on 2017-04-25.
 */

public class CalculateClient {

    public ICalculate Strategy;

    public ICalculate getStrategy() {
        return Strategy;
    }

    public void setStrategy(ICalculate strategy) {
        this.Strategy = strategy;
    }


    public CalculateClient(ICalculate iCalculate) {
        this.Strategy = iCalculate;
    }

    public int Calculate(int val1, int val2){
        return this.Strategy.Calculate(val1, val2);
    }
}
