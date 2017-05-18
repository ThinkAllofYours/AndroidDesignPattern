package kr.co.yjglogitech.androiddesignpattern.java.ch06_Prototype_Pattern;

/**
 * Created by lyder on 2017-05-12.
 */

public abstract class Shape implements Cloneable {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
}
