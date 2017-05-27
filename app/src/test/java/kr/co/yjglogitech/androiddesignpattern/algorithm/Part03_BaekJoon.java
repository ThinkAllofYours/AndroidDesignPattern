package kr.co.yjglogitech.androiddesignpattern.algorithm;

/**
 * Created by landr on 2017. 5. 27..
 */

import junit.framework.Assert;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive.Main;


public class Part03_BaekJoon {

    @Test
    public void test_1002(){
        Main _1002 = new Main();
        int result01 = _1002.getLocationNum("0 0 13 40 0 37");
        int result02 = _1002.getLocationNum("0 0 3 0 7 4");
        int result03 = _1002.getLocationNum("1 1 1 1 1 5");

        Assert.assertEquals(2, result01);
        Assert.assertEquals(1, result02);
        Assert.assertEquals(0, result03);
    }
}