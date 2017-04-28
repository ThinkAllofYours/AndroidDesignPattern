package kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern;

/**
 * Created by lyder on 2017-04-28.
 */

public class TurykeyAdapter implements Duck {

    Turkey turkey;
    public TurykeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public String quack() {
        return turkey.gobble();
    }

    @Override
    public String fly() {
        return turkey.fly();
    }
}
