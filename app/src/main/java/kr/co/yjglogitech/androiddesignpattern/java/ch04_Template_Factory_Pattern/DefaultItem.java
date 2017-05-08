package kr.co.yjglogitech.androiddesignpattern.java.ch04_Template_Factory_Pattern;

/**
 * Created by lyder on 2017-05-04.
 */

public class DefaultItem extends Item {

    private String itemName;

    public DefaultItem(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String use() {
        return itemName + "을(를) 사용했습니다.";
    }
}
