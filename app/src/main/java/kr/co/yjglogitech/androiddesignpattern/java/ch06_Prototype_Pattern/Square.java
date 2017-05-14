package kr.co.yjglogitech.androiddesignpattern.java.ch06_Prototype_Pattern;

/**
 * Created by lyder on 2017-05-12.
 */

public class A implements Cloneable{
    public int y;
    public int x;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
