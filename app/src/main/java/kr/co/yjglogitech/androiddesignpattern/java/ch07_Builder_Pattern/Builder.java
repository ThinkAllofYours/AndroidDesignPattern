package kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern;

/**
 * Created by lyder on 2017-05-15.
 */

public abstract class Builder {

    protected Monster monster;

    abstract public void setHp();
    abstract public void setAt();
    abstract public void setDf();
    abstract public void setName();

    public Monster buld(){
        setAt();
        setDf();
        setHp();
        setName();
        return monster;
    }


}
