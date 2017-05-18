package kr.co.yjglogitech.androiddesignpattern.algorithm;


import org.junit.Before;
import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive.Recursive;

import static junit.framework.Assert.assertEquals;

/**
 * Created by landr on 2017. 5. 14..
 */


public class Part01_Recursive {

    Recursive _recursive;
    @Before
    public void creator(){
        _recursive = new Recursive();
    }

    @Test
    public void basicRecursive(){
        //sum, 시에르 핀스키의 삼각형
        assertEquals(55, _recursive.sumNum(10));

        //factorial
        assertEquals(24, _recursive.factorial(4));
    }

    @Test
    public void testSearchNum01(){
        //
        int[] data = {1, 2, 3, 4, 5, 6, 11, 23, 52, 21, 33};
        int size = data.length;

        int result01 = _recursive.search(data, data.length, 11);

        assertEquals(6, result01);

        int begin = 0;
        int end = data.length-1;
        int target = 11;
        int result02 = _recursive.search01(data, begin, end, target);

        assertEquals(6, result02);

    }

    @Test
    public void testSearchNum02(){
        int[] data = {1,2,3,4,5,6,7,8,10,11,12,32,43,100};
        int result = _recursive.search02(data, 0, data.length-1, 32);
        assertEquals(11, result);
    }

    @Test
    public void Test_Find_Max_Num(){
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int result01 = _recursive.findMax01(data, 0, data.length-1);
        assertEquals(10, result01);

        int result02 = _recursive.findMax02(data, 0, data.length-1);
        assertEquals(300, result02);
    }

    @Test
    public void Test_Recursive(){

    }






}
