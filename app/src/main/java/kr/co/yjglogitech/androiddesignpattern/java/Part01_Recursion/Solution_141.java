package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

import java.util.HashMap;

/**
 * Created by landr on 2017. 6. 6..
 */

public class Solution_141 {
    ListNode first_head = null;
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        first_head = head;
        return isSameNode(head.next);
    }

    public boolean isSameNode(ListNode node){
        if(node == null) return false;

        if(node.val == first_head.val){
            return true;
        }else{
            return isSameNode(node.next);
        }
    }

    public boolean hasCycle_0ms(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    public boolean hasCycle_15ms(ListNode head) {
        HashMap<ListNode, Integer> _map = new HashMap<ListNode, Integer>();
        if(head == null || head.next == null)
            return false;
        boolean isCycle = false;
        while(head != null){
            if(_map.containsKey(head)){
                isCycle = true;
                break;
            }
            _map.put(head, 1);
            head = head.next;
        }
        return isCycle;
    }

}
