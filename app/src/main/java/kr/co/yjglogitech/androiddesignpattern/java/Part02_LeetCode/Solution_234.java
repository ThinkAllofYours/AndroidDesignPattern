package kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode;

import java.util.ArrayList;

import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.leetCode_classes.ListNode;

/**
 * Created by landr on 2017. 6. 1..
 */

public class Solution_234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrNodeVal = new ArrayList<>();
        ListNode _node = head;
        while (_node != null) {
            arrNodeVal.add(_node.val);
            _node = _node.next;
        }
        

        for (int i = 0; i < arrNodeVal.size() / 2; i++) {
            if (arrNodeVal.get(i) != arrNodeVal.get(arrNodeVal.size() - 1 - i)) {
                return false;
            }
        }

        return true;
    }


}
