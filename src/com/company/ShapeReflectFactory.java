package com.company;

public class ShapeReflectFactory {
    public static Shape getShape(Class c) {
        Shape shape = null;

        try {
            shape = (Shape) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("不支持抽象类或接口");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("没有足够权限，即不能访问私有对象");
        } catch (ClassNotFoundException e) {
            System.out.println("类不存在");
            e.printStackTrace();
        }


        return shape;
    }
}
