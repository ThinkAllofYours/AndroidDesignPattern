package kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern;

/**
 * Created by lyder on 2017-05-15.
 */

public class BTyperMonsterBuilder extends Builder {
    public BTyperMonsterBuilder() {
        monster = new Monster();
    }

    @Override
    public void setHp() {
        monster.setHp(200);
    }

    @Override
    public void setAt() {
        monster.setAt(200);
    }

    @Override
    public void setDf() {
        monster.setDf(200);
    }

    @Override
    public void setName() {
        monster.setName("해골영웅");
    }
}
