package kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode;

/**
 * Created by lyder on 2017-06-01.
 */

public class Solution_168 {

    public String convertToTitle(int n) {
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
