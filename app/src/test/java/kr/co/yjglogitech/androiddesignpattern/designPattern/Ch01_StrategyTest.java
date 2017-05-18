package kr.co.yjglogitech.androiddesignpattern;

import org.junit.Test;

import java.util.HashMap;

import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01.CalculateClient;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session02.Ax;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session02.GameCharacter;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01.ICalculate;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01.Minus;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01.Multi;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session01.Plus;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session02.Knife;
import kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session02.Sword;

import static org.junit.Assert.assertEquals;

/**
 * Created by lyder on 2017-04-25.
 */

public class Ch01_StrategyTest {
    @Test
    public void strategyTest(){
        CalculateClient client = new CalculateClient(new Minus());
        assertEquals(1, client.Calculate(3,2));

        client.setStrategy(new Plus());
        assertEquals(9, client.Calculate(7,2));

        client.setStrategy(new Multi());
        assertEquals(10, client.Calculate(5,2));
    }

    @Test
    public void strategyMapTest(){
        HashMap<String, ICalculate> calMap = new HashMap<String, ICalculate>();
        calMap.put("PLUS", new Plus());
        calMap.put("MINUS", new Minus());
        calMap.put("MULTI", new Multi());

        String command1 = "PLUS";
        assertEquals(12, calMap.get(command1).Calculate(7,5));
        String command2 = "MINUS";
        assertEquals(2, calMap.get(command2).Calculate(7,5));
        String command3 = "MULTI";
        assertEquals(35, calMap.get(command3).Calculate(7,5));
    }

    @Test
    public void strategyTest02(){
        GameCharacter character = new GameCharacter();

        character.setWeapon(new Sword());
        assertEquals("검 공격", character.attack());


        character.setWeapon(new Ax());
        assertEquals("도끼 공격", character.attack());

        character.setWeapon(new Knife());
        assertEquals("칼 공격", character.attack());


    }

}
