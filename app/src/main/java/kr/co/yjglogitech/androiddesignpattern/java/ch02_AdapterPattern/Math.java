package kr.co.yjglogitech.androiddesignpattern.java.ch02_AdapterPattern;

import android.support.annotation.NonNull;

/**
 * Created by lyder on 2017-04-27.
 */

public class Math {

    @NonNull
    public static double twiceNum(double num){return num*2;}

    @NonNull
    public static double halfNum(double num){
        return num/2;
    }

    @NonNull
    public static Double strongTwiceNum(Double num){
        return num*2;
    }
}
