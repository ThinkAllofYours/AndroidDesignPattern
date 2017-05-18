package kr.co.yjglogitech.androiddesignpattern.java.ch06_Prototype_Pattern;

/**
 * Created by lyder on 2017-05-12.
 */

public class Circle extends Shape{
    private String id;
    private int r;
    private int x;
    private int y;
    public Square square;


    @Override
    public String getId() {
        return id;
    }

    public int getR() {
        return r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Square getSquare() {
        return square;
    }

    public Circle() {
        square = new Square();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Shape copy() throws CloneNotSupportedException{
        Circle shape = (Circle) clone();
        shape.x += r;
        shape.y += r;
        shape.setSquare((Square)shape.getSquare().clone());
        return shape;
    }
}
