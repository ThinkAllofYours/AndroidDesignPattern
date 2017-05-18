package kr.co.yjglogitech.androiddesignpattern;

import org.junit.Test;

import kr.co.yjglogitech.androiddesignpattern.java.ch06_Prototype_Pattern.Circle;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lyder on 2017-05-12.
 */

public class Ch06_PrototypeTest {

    @Test
    public void prototypeTest01() throws CloneNotSupportedException{

        Circle circle1 = new Circle();

        circle1.setId("1");

        circle1.setX(1);
        circle1.setY(1);
        circle1.setR(3);

        circle1.square.x = 1;
        Circle circle2 = (Circle)circle1.copy();

        assertEquals(circle1.square.x, circle2.square.x);

        circle1.square.x = 2;
        assertEquals(circle1.square.x, circle2.square.x);

    }
}
