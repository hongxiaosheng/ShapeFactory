package com.company;

public class ReflectClassMain {

    public static void main(String[] args) {
        ShapeClassFactory shapeClassFactory = new ShapeClassFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = (Shape) shapeClassFactory.getInstance(Circle.class);

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = (Shape) shapeClassFactory.getInstance(Rectangle.class);

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = (Shape) shapeClassFactory.getInstance(Square.class);

        //call draw method of circle
        shape3.draw();
    }
}
