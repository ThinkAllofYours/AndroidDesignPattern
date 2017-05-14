package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

/**
 * Created by landr on 2017. 5. 14..
 */

public class Recursive {

    /*
     *  암시적 매개변수 대신
     *  명시적 매개변수를 써라
     *
     * */

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


}
