package kr.co.yjglogitech.androiddesignpattern;

import junit.framework.Assert;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive.Recursive;

/**
 * Created by landr on 2017. 5. 14..
 */


public class Part01_Recursive {

    @Test
    public void testSearchNum01(){
        //
        int[] data = {1, 2, 3, 4, 5, 6, 11, 23, 52, 21, 33};
        int size = data.length;

        Recursive _recursive = new Recursive();
        int result = _recursive.search(data, data.length, 11);

        Assert.assertEquals(6, result);
    }


}
