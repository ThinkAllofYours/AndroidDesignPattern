package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lyder on 2017-05-18.
 */

public class Solution {
    final static HashMap<Integer, Integer> _map = new HashMap<Integer, Integer>();
    private int result;

    public int climbStairs(int n) {
        if (n < 2)
            return 1;
        if (_map.containsKey(n)) {
            return _map.get(n);
        }
        result = climbStairs(n - 1) + climbStairs(n - 2);
        _map.put(n, result);
        return result;
    }

    int ans = 0;

    public int climbStairs_sample(int n) {
        if (n == 0 || n == 1 || n == 2) return n;
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n - 1];
    }

    public final int checked = 2;
    public int islandperimeter(int[][] grid){
        int row=0, col=0;
        for(int r = 0 ; r < grid.length ; r++ ){
            for(int c = 0 ; c <grid[0].length ; c++){
                if(grid[r][c]==1){
                    row = r;
                    col = c;
                    break;
                }
            }
            if(grid[row][col]==1)
                break;
        }

        return count_perimeter(grid, row, col);
    }

    public int count_perimeter(int[][] grid, int row, int col){

        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return 1;
        }

        if(grid[row][col]==0){
            return 1;
        } else if(grid[row][col]==1) {
            grid[row][col]=checked;
            return count_perimeter(grid, row+1, col)
                    + count_perimeter(grid, row-1, col)
                    + count_perimeter(grid, row, col-1)
                    + count_perimeter(grid, row, col+1);
        } else {
            return 0;
        }
    }

    public int islandPerimeter_123ms(int[][] grid) {
        int islands=0, neighbours =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    islands++;
                    if(i<grid.length -1 && grid[i+1][j]==1 ) neighbours++;
                    if(j<grid[i].length-1 && grid[i][j+1] == 1) neighbours++;
                }
            }
        }
        return islands *4 - neighbours*2;
    }


    //================ algospot Weird Numbers ===================
    public boolean blnResult = false;
    ArrayList<String>  resultArr = new ArrayList<String>();
    public void judgementWeird(ArrayList<Integer> divisors, int sum, int num, int idx){

        if(sum == num){
            blnResult = true;
            return;
        }else if(sum < num && idx < divisors.size()){
            for(int start_idx = idx; start_idx < divisors.size(); start_idx++){
                int nextSum = sum + divisors.get(start_idx);
                judgementWeird(divisors, nextSum, num, start_idx+1);
            }
        }

    }

    public String find_weirdNum(int num){
        blnResult = false;
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= num/2 ; i++){
            if(num%i==0){
                divisors.add(i);
            }
        }
        int sum_divisors = 0;
        for(int i : divisors){
            sum_divisors += i;
        }
        if(sum_divisors <= num)
            return "not weird";

        for(int startIdx = 0; startIdx < divisors.size()-1; startIdx++ ){
            judgementWeird(divisors, divisors.get(startIdx), num, startIdx+1);
        }

        if(blnResult==true){
            return "not weird";
        }else {
            return "weird";
        }
    }

}
