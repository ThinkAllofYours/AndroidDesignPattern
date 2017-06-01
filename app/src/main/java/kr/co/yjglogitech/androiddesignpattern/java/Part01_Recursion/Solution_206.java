package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

/**
 * Created by landr on 2017. 6. 2..
 */

public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if(head != null){
            ListNode end = head.next;
            ListNode front = head;
            head.next = null;
            return reverseListNode(front, end);
        }else{
            return head;
        }
    }

    public ListNode reverseListNode(ListNode front, ListNode end){
        if(end != null){
            ListNode temp_node = end.next;
            end.next = front;
            return reverseListNode(end, temp_node);
        }else{
            return front;
        }
    }


}
