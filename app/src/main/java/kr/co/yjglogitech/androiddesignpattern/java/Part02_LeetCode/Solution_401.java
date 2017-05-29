package kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by landr on 2017. 5. 28..
 */

public class Solution_401 {
    List<String> results = new ArrayList<String>();
    public int[] lst_hour = BinaryMap.getInstance().lst_Hour;
    public int[] lst_minutes = BinaryMap.getInstance().lst_Minutes;
    public List<String> readBinaryWatch(int num) {
        addReadBinaryWatch(num,0);
        return results;
    }

    public void addReadBinaryWatch(int forLoopHour, int forLoopMinutes){
        if(forLoopHour <= 3 && forLoopHour >= 0 && forLoopMinutes <= 5 && forLoopMinutes >= 0){
            for(int i = 0 ; i < 12 ; i++){
                if(lst_hour[i]==forLoopHour){
                    String strHour = Integer.toString(i) + ":";
                    for(int j = 0 ; j < 60 ; j++){
                        if(lst_minutes[j]==forLoopMinutes){
                            String strMinutes = "";
                            if(j<10){
                                strMinutes = "0";
                            }
                            strMinutes += Integer.toString(j);
                            results.add(strHour + strMinutes);
                        }
                    }
                }
            }
            forLoopHour--; forLoopMinutes++;
            addReadBinaryWatch(forLoopHour, forLoopMinutes);
        }else if(forLoopHour >= 0 && forLoopMinutes >=0){
            forLoopHour--; forLoopMinutes++;
            addReadBinaryWatch(forLoopHour, forLoopMinutes);
        }
    }


    public static class BinaryMap{

        public int[] lst_Hour = new int[12];
        public int[] lst_Minutes = new int[60];

        private BinaryMap(){
            setLst_Hour();
            setLst_Minutes();
        }

        private static class Singleton{
            private static final BinaryMap instance = new BinaryMap();
        }

        public void setLst_Hour(){
            lst_Hour[0] = 0;
            for(int i = 1; i < 12; i++){
                lst_Hour[i] = get_Num_One_Count(Integer.toBinaryString(i));
            }
        }

        public void setLst_Minutes(){
            lst_Minutes[0] = 0;
            for(int i = 1; i < 60; i++){
                lst_Minutes[i] = get_Num_One_Count(Integer.toBinaryString(i));
            }
        }

        public static BinaryMap getInstance(){
            return Singleton.instance;
        }
    }

    public static int get_Num_One_Count(String binaryString){
        int cnt = 0;
        for (char c : binaryString.toCharArray()){
            if(c=='1') cnt++;
        }
        return cnt;
    }

    public static class Solution_2ms {
        public List<String> readBinaryWatch(int num) {
            List<String> result = new ArrayList<>();
            help(num, 0, 0, 0, result);
            return result;
        }//from LCers

        //비트를 확인해서 Hour 비트와 Minutes 비트를 하나씩 밀어서 계산
        private void help(int num, int pos, int hour, int minute, List<String> result) {
            if (hour > 11 || minute > 59)
                return;
            if (num == 0) {
                result.add("" + hour + ":" + (minute > 9 ? minute : "0" + minute));
                return;
            }
            for (int i = pos; i < 10; i++) {
                if (i <= 3) {
                    help(num-1, i+1, hour + (1 << (3 - i)), minute, result);
                } else {
                    help(num-1, i+1, hour, minute + (1 << (9 - i)), result);
                }
            }
        }
    }

    public class Solutio_3ms {
        public List<String> readBinaryWatch(int num) {
            LinkedList<String> possibleTimes = new LinkedList<String>();

            for (int i = 0; i < 12; i++){
                for (int j = 0; j < 60; j++){
                    if (Integer.bitCount(i) + Integer.bitCount(j) == num){
                        possibleTimes.add(i + ":" + (j < 10 ? "0" + j : j));
                    }
                }
            }

            return possibleTimes;
        }

    }

}
