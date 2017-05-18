package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

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

}
