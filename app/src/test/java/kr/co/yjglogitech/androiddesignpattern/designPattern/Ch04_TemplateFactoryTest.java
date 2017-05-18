package kr.co.yjglogitech.androiddesignpattern.designPattern;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.ch04_Template_Factory_Pattern.Creator;
import kr.co.yjglogitech.androiddesignpattern.java.ch04_Template_Factory_Pattern.DefaultItemCreator;
import kr.co.yjglogitech.androiddesignpattern.java.ch04_Template_Factory_Pattern.Item;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lyder on 2017-05-04.
 */

public class Ch04_TemplateFactoryTest {

    @Test
    public void testTemplateFactory01(){
        Creator creator = new DefaultItemCreator();

        Item item1 = creator.create("나무칼");
        Item item2 = creator.create("나무방패");
        Item item3 = creator.create("나무갑주");

        assertEquals("나무칼을(를) 사용했습니다.", item1.use());
        assertEquals("나무방패을(를) 사용했습니다.", item2.use());
        assertEquals("나무갑주을(를) 사용했습니다.", item3.use());
    }

}
