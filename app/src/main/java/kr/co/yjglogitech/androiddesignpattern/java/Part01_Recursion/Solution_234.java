package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by landr on 2017. 6. 2..
 */

public class Solution_234 {
    Stack<ListNode> _stack = new Stack<>();
    public boolean isPalindrome(ListNode head) {
        boolean is_palindrome = true;
        if(head == null || head.next == null) return true;
        ListNode _head = head;

        while(_head != null){
            _stack.push(_head);
            _head = _head.next;
        }

        int half_nodeSize = _stack.size()/2;
        for(int i = 1 ; i <= half_nodeSize ; i++){
            if(_stack.pop().val == head.val){
                head = head.next;
            }else {
                is_palindrome = false;
            }
        }
        return  is_palindrome;
    }

    public boolean isPalindrome_1ms(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode rev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = rev;
            rev = slow;
            slow = temp;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != rev.val) {
                return false;
            }
            slow = slow.next;
            rev = rev.next;
        }
        return true;
    }

    public boolean isPalindrome_2ms(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        ListNode prev = null, curr = slowPtr;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode head1 = head, head2 = prev;
        while (head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }
}
