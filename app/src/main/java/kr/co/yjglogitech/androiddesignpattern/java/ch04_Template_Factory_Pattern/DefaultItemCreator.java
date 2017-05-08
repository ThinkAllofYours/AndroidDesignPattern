package kr.co.yjglogitech.androiddesignpattern.java.ch04_Template_Factory_Pattern;

/**
 * Created by lyder on 2017-05-04.
 */

public class DefaultItemCreator extends Creator {

    @Override
    protected String init(String itemName) {
        System.out.println("Default initailize");
        return itemName;
    }

    @Override
    protected String end(String itemName) {
        System.out.println("Default 마무리 작업");
        return itemName;
    }

    @Override
    protected Item createItem(String itemName) {
        return new DefaultItem(itemName);
    }
}
