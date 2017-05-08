package kr.co.yjglogitech.androiddesignpattern.java.ch04_Template_Factory_Pattern;

/**
 * Created by lyder on 2017-05-04.
 */

public abstract class Creator {


    public Item create(String itemName){
        init(itemName);
        Item item = createItem(itemName);
        end(itemName);

        return item;
    }

    abstract protected String end(String itemName);

    abstract protected String init(String itemName);

    abstract protected Item createItem(String itemName);
}
