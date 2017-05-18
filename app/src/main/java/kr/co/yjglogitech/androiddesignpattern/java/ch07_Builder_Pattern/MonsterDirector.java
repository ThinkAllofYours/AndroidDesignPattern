package kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern;

/**
 * Created by lyder on 2017-05-15.
 */

public class MonsterDirector {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Monster gen(){
        return builder.buld();
    }
}
