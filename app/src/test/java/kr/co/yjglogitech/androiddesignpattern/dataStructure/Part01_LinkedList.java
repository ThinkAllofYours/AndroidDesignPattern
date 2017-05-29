package kr.co.yjglogitech.androiddesignpattern.dataStructure;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import kr.co.yjglogitech.androiddesignpattern.java.DataStructure.LinkedList;

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
}
