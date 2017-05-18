package kr.co.yjglogitech.androiddesignpattern.designPattern;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.ATypeMonsterBuilder;
import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.BTyperMonsterBuilder;
import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.Builder;
import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.Monster;
import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.MonsterDirector;
import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.PersonInfo;
import kr.co.yjglogitech.androiddesignpattern.java.ch07_Builder_Pattern.PersonInfoBuilder;

/**
 * Created by lyder on 2017-05-15.
 */

public class Ch07_BuilderPattern {

    @Test
    public void builder_pattern(){
        MonsterDirector director = new MonsterDirector();
        Builder builder = new ATypeMonsterBuilder();

        director.setBuilder(builder);

        System.out.println(director.gen());

        builder = new BTyperMonsterBuilder();
        director.setBuilder(builder);
        Monster monster = director.gen();

        System.out.println(monster);

    }

    @Test
    public void builder_pattern_01(){
        PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();

        PersonInfo result = personInfoBuilder
                .setAge(12)
                .setName("Bob")
                .setFavoriteAnimal("dog")
                .setFavoriteColor("blue")
                .setFavoriteNumber(7)
                .build();


    }
}
