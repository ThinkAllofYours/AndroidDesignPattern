package kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session02;

/**
 * Created by lyder on 2017-04-25.
 */

public class Sword implements IWeapon {
    @Override
    public String doAttack() {
        return "검 공격";
    }
}
