package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
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


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        while(cases-- > 0){
            String strInput = sc.next();
            String[] arrInput = strInput.split(" ");
            int x1 = Integer.parseInt(arrInput[0]);
            int y1 = Integer.parseInt(arrInput[1]);
            double r1 = (double)Integer.parseInt(arrInput[2]);
            int x2 = Integer.parseInt(arrInput[3]);
            int y2 = Integer.parseInt(arrInput[4]);
            double r2 = (double)Integer.parseInt(arrInput[5]);


            if(x1==x2 && y1==y2 && (Double.compare(r1, r2)==0)){
                sb.append("-1\n");
            }else {
                double dist = getDistance(x1, y1, x2, y2);
                double plus_r1_r2 = r1 + r2;
                double minus_r1_r2 = Math.abs(r1 - r2);
                int comparePlus = Double.compare(dist, plus_r1_r2);
                int compareMinus = Double.compare(dist, minus_r1_r2);

                if(compareMinus == 1 && comparePlus == -1) {
                    sb.append("2\n");
                }else if((compareMinus == 0 && Double.compare(r1, r2)!=0) || comparePlus == 0){
                    sb.append("1\n");
                }else if((compareMinus == -1 && Double.compare(r1, r2)!=0) || comparePlus == 1){
                    sb.append("0\n");
                }else {
                    sb.append("-1\n");
                }
            }
        }
        writer.write(sb.toString());
		writer.close();
    }



    public static double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
    }


    public int getLocationNum(String strInput) {
        String[] arrInput = strInput.split(" ");
        int x1 = Integer.parseInt(arrInput[0]);
        int y1 = Integer.parseInt(arrInput[1]);
        double r1 = (double)Integer.parseInt(arrInput[2]);
        int x2 = Integer.parseInt(arrInput[3]);
        int y2 = Integer.parseInt(arrInput[4]);
        double r2 = (double)Integer.parseInt(arrInput[5]);


        if(x1==x2&&y1==y2&&(Double.compare(r1, r2)==0)){
            return -1;
        }else{
            double dist = getDistance(x1, y1, x2, y2);
            double plus_r1_r2 = r1 + r2;
            double minus_r1_r2 = Math.abs(r1 - r2);
            int comparePlus = Double.compare(dist, plus_r1_r2);
            int compareMinus = Double.compare(dist, minus_r1_r2);

            if(compareMinus == 1 && comparePlus == -1) {
                return 2;
            }else if(compareMinus == 0 || comparePlus == 0){
                return 1;
            }else {
                return 0;
            }
        }
    }
}
