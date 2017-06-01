package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

/**
 * Created by lyder on 2017-05-15.
 */

public class Recursive_prac {

    public int sumNum(int n){
        int sum = 0;
        for(int i = n; i > 0 ; i--){
            sum += i;
        }
        return sum;
    }


    int i = 0;
    public void function(){
        i++;
        System.out.println("Hello Recursive : " + i);
        function();
    }

    public int searchNum(int[] data, int target){
        for(int i = 0 ; i < data.length ; i++){
            if(data[i]==target){
                return i;
            }
        }

        return 0;
    }


}
