package kr.co.yjglogitech.androiddesignpattern;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.ch03_Template_Method_Pattern.AbstConnectHelper;
import kr.co.yjglogitech.androiddesignpattern.java.ch03_Template_Method_Pattern.ConCreateConnectHelper;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lyder on 2017-04-28.
 */

public class Ch03_TemplateMethodPattern {

    @Test
    public void testTemplateMethod01(){
        AbstConnectHelper abstConnectHelper = new ConCreateConnectHelper();
        String result = abstConnectHelper.requestConnection("info");

        assertEquals("FreeUser", result);
    }

}
