package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.leetCode_classes.ListNode;

/**
 * Created by landr on 2017. 6. 6..
 */

public class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;

        // recursion method
        ListNode next = removeElements(head.next, val);
        // if self contains that value, return next one.
        if( head.val == val) return next;
        head.next = next;
        return head;
    }

    ListNode real_head = null;
    public ListNode removeElements_me(ListNode head, int val) {
        real_head = head;

        if(head == null){
            return null;
        }

        if(head.val == val && head.next == null){
            return null;
        }

        removeRecurs(null, head, val);
        return real_head;
    }

    public void removeRecurs(ListNode pre, ListNode node, int val){
        if(node != null){
            if(node.val == val){
                if(pre != null){
                    pre.next = node.next;
                    removeRecurs(pre, node.next, val);
                }else{
                    real_head = node.next;
                    removeRecurs(null, node.next, val);
                }
            }else{
                removeRecurs(node, node.next, val);
            }
        }
    }
}
