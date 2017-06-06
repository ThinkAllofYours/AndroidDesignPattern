package kr.co.yjglogitech.androiddesignpattern.dataStructure;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kr.co.yjglogitech.androiddesignpattern.java.DataStructure.LinkedList;
import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion.ListNode;
import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion.Solution_141;
import kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursion.Solution_203;

/**
 * Created by lyder on 2017-05-22.
 */

public class Part01_LinkedList {
    @Test
    public void testLinkedList01(){
        LinkedList _linkedList0 = new LinkedList();
        System.out.println("============================");
        System.out.println(_linkedList0);
        System.out.println(_linkedList0.hashCode());
        LinkedList _linkedList1 = new LinkedList();
        _linkedList0.next = _linkedList1;
        _linkedList1.head = _linkedList0;

        System.out.println("============================");
        Assert.assertEquals(_linkedList0, _linkedList1.head);
        Assert.assertEquals(_linkedList1, _linkedList0.next);

        System.out.println("============================");
        LinkedList _linkedList3 = new LinkedList();
        List _list = new ArrayList();
        System.out.println(_list.hashCode());
        List _list2 = new ArrayList();
        System.out.println(_list2.hashCode());

    }

//    @Test
//    public void test203(){
//        Solution_203 _sol = new Solution_203();
//        ListNode node_01 = new ListNode(1);
//        ListNode node_02 = new ListNode(2);
//        ListNode node_03 = new ListNode(4);
//        ListNode node_04 = new ListNode(3);
//        ListNode node_05 = new ListNode(6);
//        ListNode node_06 = new ListNode(7);
//        ListNode node_07 = new ListNode(2);
//        node_01.next = node_02;
//        node_02.next = node_03;
//        node_03.next = node_04;
//        node_04.next = node_05;
//        node_05.next = node_06;
//        node_06.next = node_07;
//        Assert.assertEquals(2, _sol.removeElements(node_01, 2));
//    }

    @Test
    public void test141(){
        Solution_141 _sol = new Solution_141();
        ListNode node_01 = new ListNode(3);
        ListNode node_02 = new ListNode(2);
        ListNode node_03 = new ListNode(0);
        ListNode node_04 = new ListNode(-4);

        node_01.next = node_02;
        node_02.next = node_03;
        node_03.next = node_04;
        node_04.next = node_01;

        Assert.assertEquals(true, _sol.hasCycle(node_01));

        HashMap<ListNode, Integer> _map = new HashMap<ListNode, Integer>();
        _map.containsKey()
    }


}
