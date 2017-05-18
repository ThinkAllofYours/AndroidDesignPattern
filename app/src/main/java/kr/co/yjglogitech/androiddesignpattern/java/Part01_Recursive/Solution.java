package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

import java.util.HashMap;

/**
 * Created by lyder on 2017-05-18.
 */

public class Solution {
    final static HashMap<Integer, Integer> _map = new HashMap<Integer, Integer>();
    int result;

    public int climbStairs(int n) {
        if(n<2)
            return 1;
        if(_map.containsKey(n)){
            return _map.get(n);
        }
        result = climbStairs(n-1) + climbStairs(n-2);
        _map.put(n, result);
        return result;
    }


}
