package kr.co.yjglogitech.androiddesignpattern.java.ch01_StrategyPattern.Session02;

/**
 * Created by lyder on 2017-04-25.
 */

public class GameCharacter {

    public IWeapon Weapon;

    public GameCharacter() {
    }

    public IWeapon getWeapon() {
        return Weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.Weapon = weapon;
    }


    public String attack() {
        return Weapon.doAttack();
    }
}
