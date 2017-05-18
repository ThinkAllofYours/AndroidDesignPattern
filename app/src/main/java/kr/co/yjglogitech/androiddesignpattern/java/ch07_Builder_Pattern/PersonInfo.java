package kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern;

/**
 * Created by lyder on 2017-05-15.
 */

public class PersonInfo {

    public String name;
    public Integer age;
    public String favoriteColor;
    public String favoriteAnimal;
    public Integer favoriteNumber;

    public PersonInfo(String name, Integer age, String favoriteColor, String favoriteAnimal, Integer favoriteNumber) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.favoriteAnimal = favoriteAnimal;
        this.favoriteNumber = favoriteNumber;
    }
}
