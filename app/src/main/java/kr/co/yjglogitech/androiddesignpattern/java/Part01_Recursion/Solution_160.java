package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion;

/**
 * Created by landr on 2017. 6. 6..
 */

public class Solution_160 {
    ListNode find_node = null;
    public ListNode getIntersectionNode_stackOverFlow(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return find_node;
        }

        if(headA.next != null && headB.next != null){
            if(headA.next == null && headB.next != null){
                find_node = getIntersectionNode_stackOverFlow(headA, headB.next);
            }

            if(headB.next == null && headA.next != null){
                find_node = getIntersectionNode_stackOverFlow(headA.next, headB);
            }

            if(headB.next != null && headA.next != null){
                find_node = getIntersectionNode_stackOverFlow(headA.next, headB.next);
            }

            if(headA == headB){
                find_node = headA;
            }
        }
        return find_node;
    }

    //Output:
    //No intersection, ERROR: linked structure was modified.
    public ListNode getIntersectionNode_modified(ListNode headA, ListNode headB) {
        ListNode find_node = null;
        if(headA == null || headB == null)
            return find_node;

        if(headA.next != null){
            headA = reverseNode(null, headA);
        }

        while(headA.val == headB.val){
            find_node = headA;
            headA = headA.next;
            headB = headB.next;
            if(headA == null || headB == null)
                break;
        }
        return find_node;
    }

    public ListNode reverseNode(ListNode pre, ListNode cur){
        if(cur == null) return pre;
        ListNode newHead = reverseNode(cur, cur.next);
        cur.next = pre;
        return newHead;
    }

    public ListNode getIntersectionNode_stackover2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return find_node;

        find_intersectionNode(headA, headB);
        return find_node;
    }

    public void find_intersectionNode(ListNode headA, ListNode headB){
        if(headA != null && headB != null){
            if(headA.val > headB.val){
                find_intersectionNode(headA, headB.next);
            }else if(headB.val > headA.val){
                find_intersectionNode(headA.next, headB);
            }else{
                find_node = headA;
                return;
            }
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode find_node = null;
        if(headA == null || headB == null){
            return find_node;
        }else if(headA.val == headB.val){
            return headA;
        }

        while(headA.val != headB.val){
            if(headA.val > headB.val){
                headB = headB.next;
                find_node = headB;
            }else if(headB.val > headA.val){
                headA = headA.next;
                find_node = headA;
            }

            if(headA == null || headB == null)
                break;
        }

        return find_node;
    }
}
