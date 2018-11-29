package com.company;

public class ReflectMain {

    public static void main(String[] args) {

        //get an object of Circle and call its draw method.
        Shape shape1 = ShapeReflectFactory.getShape(Circle.class);

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = ShapeReflectFactory.getShape(Rectangle.class);

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = ShapeReflectFactory.getShape(Square.class);

        //call draw method of circle
        shape3.draw();
    }
}
