package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

/**
 * Created by landr on 2017. 6. 2..
 */

public class Solution_206_other {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = recurse(null, head);
        return newHead;
    }

    public ListNode recurse(ListNode prev, ListNode cur) {
        if (cur == null) return prev;
        ListNode newHead = recurse(cur, cur.next);
        cur.next = prev;
        return newHead;
    }
}
