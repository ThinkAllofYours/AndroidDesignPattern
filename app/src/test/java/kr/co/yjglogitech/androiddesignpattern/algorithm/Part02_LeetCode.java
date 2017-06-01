package kr.co.yjglogitech.androiddesignpattern.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.Solution_168;
import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.Solution_401;

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
    public void testAscii(){
        int plus = 2;
        char a = (char) (65 + plus);
        char b = 20;
        String str = String.valueOf(a) ;
        assertEquals("C", str);

        int check = 703%26;
        assertEquals(26, check);
    }

    @Test
    public void testLeetCode_168(){
        Solution_168 _sol = new Solution_168();
        //String result01 = _sol.convertToTitle(703);
        //String result02 = _sol.convertToTitle(27);
        String result03 = _sol.convertToTitle(52);
        //assertEquals("ACB", result01);
        //assertEquals("AA", result02);
        assertEquals("AZ", result03);
    }
}

