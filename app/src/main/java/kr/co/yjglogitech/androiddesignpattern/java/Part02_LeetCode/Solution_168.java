package kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode;

/**
<<<<<<< HEAD
 * Created by landr on 2017. 5. 30..
 */

public class Solution_168 {
    String[] sheet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
                    , "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"
                    , "U", "V", "W", "X", "Y", "Z"};
    public String convertToTitle(int n) {
        int num1 = (n - 1) / 26;
        int num2 = n % 26;

        StringBuffer sb = new StringBuffer();


        if (n < 27) {
            sb.append(sheet[n - 1]);
        } else {
            sb.append(sheet[num1 - 1]);
            if (num2 == 0) {
                sb.append(sheet[25]);
            } else {
                sb.append(sheet[num2 - 1]);
            }

        }

        return sb.toString();
    }

    public String convertToTitle_ohter1(int n) {
        StringBuilder _stringBuilder = new StringBuilder();
        recursion_convertToTile(n, _stringBuilder);
        return _stringBuilder.toString();
    }

    public void recursion_convertToTile(int n, StringBuilder sb){
        if(n>26){
            int intSheet = n/26;
            int intAppendNum = n%26;
            if(intSheet > 26) {
                if(intSheet%26==0){
                    sb.append("Z");
                }else {
                    sb.append(String.valueOf((char) (64 + intSheet % 26)));
                }
                recursion_convertToTile(intSheet + intAppendNum, sb);
            }else {
                sb.append(String.valueOf((char) (64 + intSheet)));
                if(intAppendNum==0){
                    sb.append("Z");
                }else{
                    sb.append(String.valueOf((char)(64+intAppendNum)));
                }
            }
        }else{
            sb.append(String.valueOf((char)(64+n)));
        }
    }
}
