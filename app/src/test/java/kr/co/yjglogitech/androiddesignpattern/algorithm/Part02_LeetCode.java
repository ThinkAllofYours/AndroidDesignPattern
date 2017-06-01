package kr.co.yjglogitech.androiddesignpattern.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.Solution_168;
import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.Solution_234;
import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.Solution_401;
import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.leetCode_classes.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by landr on 2017. 5. 27..
 */

public class Part02_LeetCode {
    @Test
    public void testSolution_401(){
        Solution_401 _solution_401 = new Solution_401();
        Solution_401.Solution_2ms solution_2ms = new Solution_401.Solution_2ms();
        List<String> actual = Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32");

        assertThat(actual, is(_solution_401.readBinaryWatch(1)));

        assertThat(actual, is(solution_2ms.readBinaryWatch(4)));

    }

    @Test
    public void testSolution_168(){
        Solution_168 solution_168 = new Solution_168();
//        String result01 = solution_168.convertToTitle(26);
//        String result02 = solution_168.convertToTitle(52);
//        String result03 = solution_168.convertToTitle(27);
//        String result04 = solution_168.convertToTitle(53);
        String result05 = solution_168.convertToTitle(703);

//        assertEquals("Z", result01);
//        assertEquals("AZ", result02);
//        assertEquals("AA", result03);
//        assertEquals("BA", result04);

    }

    @Test
    public void testSolution_234(){
        Solution_234 solution_234 = new Solution_234();

        ListNode node1 = new ListNode(-126);
        ListNode node2 = new ListNode(-126);

        node1.next = node2;


        assertEquals(solution_234.isPalindrome(node1), true);
    }
}
