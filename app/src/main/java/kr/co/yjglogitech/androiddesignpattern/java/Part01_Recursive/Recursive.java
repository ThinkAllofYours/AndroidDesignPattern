package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01.Plus;

/**
 * Created by landr on 2017. 5. 14..
 */

public class Recursive {

    /**
     *  암시적 매개변수 대신
     *  명시적 매개변수를 써라
     */

    /**
     * Factorial : n!
     */
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    /**
     * Sum
     */
    public static int sumNum(int n){
        if(n==1)
            return 1;
        else
            return n+sumNum(n-1);
    }


    /**
     * Recursive 기본 개념
     * 기본적인 순차 탐색 (데이터가 정렬 되어 있지 않은 경우)
     */

    public int search(int[] data, int length, int target) {
        for(int i = 0 ; i < length ; i++){
            if(data[i]==target){
                return i;
            }
        }
        return -1;
    }

    public int search01(int[] data, int begin, int end, int target) {
        if(begin > end)
            return -1;
        else if(target == data[begin])
            return begin;
        else
            return search01(data, begin+1, end, target);
    }

    //Recursive binary Search01
    public int search02(int[] data, int begin, int end, int target){
        if(begin > end)
            return -1;
        else {
            int middle = (begin+end)/2;
            if(data[middle]==target)
                return middle;
            int index = search02(data, begin, middle-1, target);
            if(index != -1)
                return index;
            else
                return search02(data, middle+1, end, target);
        }
    }


    public int findMax01(int[] data, int begin, int end) {
        if(begin == end)
            return data[begin];
        else{

            return Math.max(data[begin], findMax01(data, begin+1, end));
        }
    }

    public int findMax02(int[] data, int begin, int end){
        if(begin == end)
            return data[begin];
        else {
            System.out.println(begin);
            int middle = (begin+end)/2;
            int max1 = findMax02(data, begin, middle);
            int max2 = findMax02(data, middle+1, end);
            return Math.max(max1,max2);
        }
    }

    public static int binary_search_string(String[] items, String target, int begin, int end){
        if(begin>end)
            return -1;
        else {
            int middle = (begin + end)/2;
            int compResult = target.compareTo(items[middle]);
            if(compResult == 0)
                return middle;
            else if(compResult<0)
                return binary_search_string(items, target, begin, middle-1);
            else
                return binary_search_string(items, target, middle+1, end);
        }
    }

    public static int binary_search_num(int[] data, int target, int begin, int end){
        if(begin>end)
            return -1;
        else {
            int middle = (begin+end)/2;
            if(data[middle] == target)
                return middle;
            else if(data[middle]<target)
                return binary_search_num(data, target, middle+1, end);
            else
                return binary_search_num(data, target, begin, middle-1);
        }
    }
}
