package java_basic.oop.implement;

public class Circle implements ColoredDrawable, Movable {
    @Override
    public void draw() {
        System.out.println("绘制一个圆形");
    }

    @Override
    public void move() {

    }

    @Override
    public void setColor(String color) {

    }
}