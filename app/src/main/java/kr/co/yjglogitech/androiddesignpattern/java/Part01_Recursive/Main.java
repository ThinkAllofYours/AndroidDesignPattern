package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

import java.util.ArrayList;

/**
 * Created by landr on 2017. 5. 22..
 */

public class Main {
    public static boolean result = false;
    static ArrayList<String>  resultArr = new ArrayList<String>();
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int cases = sc.nextInt();
//        while(cases-->0){
//            String scNum = sc.next();
//            int num = 0;
//
//            try{
//                num = Integer.parseInt(scNum);
//            }catch (Exception ex){};
//
//            ArrayList<Integer> divisors = new ArrayList<Integer>();
//            for(int i = 1; i <= num/2 ; i++){
//                if(num%i==0){
//                    divisors.add(i);
//                }
//            }
//
//            for(int startIdx = 0; startIdx < divisors.size()-1 ; startIdx++ ){
//                judgementWeird(divisors, 0, num, startIdx);
//            }
//
//            if(result==true){
//                resultArr.add("not weird");
//            }else {
//                resultArr.add("weird");
//            }
//
//        }
//    }

    public static void judgementWeird(ArrayList<Integer> divisors, int sum, int num, int idx){

        if(sum == num){
            result = true;
        }else if(sum < num || idx < divisors.size()){
            for(int i = idx; i < divisors.size(); i++){
                int nextSum = sum + divisors.get(i);
                judgementWeird(divisors, nextSum, num, idx+1);
            }
        }

    }


}
