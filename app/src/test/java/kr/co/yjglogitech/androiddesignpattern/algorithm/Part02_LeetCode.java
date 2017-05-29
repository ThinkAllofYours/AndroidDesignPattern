package kr.co.yjglogitech.androiddesignpattern.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kr.co.yjglogitech.androiddesignpattern.java.Part02_LeetCode.Solution_401;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
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
}
