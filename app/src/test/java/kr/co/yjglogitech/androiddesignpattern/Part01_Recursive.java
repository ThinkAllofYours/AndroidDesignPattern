package kr.co.yjglogitech.androiddesignpattern;


import org.junit.Before;
import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive.Recursive;
import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive.Recursive_prac;
import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive.Solution;

import static junit.framework.Assert.assertEquals;

/**
 * Created by landr on 2017. 5. 14..
 */


public class Part01_Recursive {

    Recursive _recursive;
    Recursive_prac _recursive_prac;
    @Before
    public void creator(){
        _recursive_prac = new Recursive_prac();
        _recursive = new Recursive();
    }

    @Test
    public void basicRecursive_prac(){
        //assertEquals(55, _recursive_prac.sumNum(10));

        _recursive_prac.function();
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
        int target01 = 11;
        int result01 = _recursive.search(data, data.length, target01);

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

        //binary
        String[] items = {"임도경", "김진규", "정이슬", "정아름", "홍선기"};
        //선정렬
        String targetString = "김진규";


        int[] itemsSort = {1,2,3,5,6,7,8,9,10,11,12,13,14};
        int targetNum = 13;
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
    public void Test_Quick_Sort() {
        int[] data = {5, 6, 3, 2, 1, 6, 7, 9, 8, 10};
        _recursive.quickSort(data, 0, data.length - 1);
        int[] sortData = {1, 2, 3, 5, 6, 6, 7, 8, 9, 10};
        assertEquals(sortData, data);
    }

    @Test
    public void LeetCode_70_climbStairs(){
        int case01 = 1;
        int case02 = 2;
        int case03 = 50;

        Solution _solution = new Solution();
        int result01 = _solution.climbStairs(case01);
        int result02 = _solution.climbStairs(case02);
        int result03 = _solution.climbStairs(case03);

        assertEquals(1, result01);
        assertEquals(2, result02);
        assertEquals(50, result03);


    }





}
