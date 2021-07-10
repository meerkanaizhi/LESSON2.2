package com.company;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {
	//write your code here
        Circle circle = new Circle(15);
        //System.out.println(circle.calculatePerimeter());

        Square square = new Square (3 );
        //System.out.println(square.calculatePerimeter());

        Triangle triangle = new Triangle (33, 15, 23);
       // System.out.println(triangle.calculatePerimeter());

        og og = new og();
        og.draw();




        Drawable[] drawables = {new
                Triangle(33, 15, 23), circle, square, og};

        for (Drawable drawable: drawables){
            if (drawable instanceof Figure) {


                System.out.println("Периметр " + drawable.getClass().getSimpleName() + " " + ((Figure) drawable).calculatePerimeter());
            }
            drawable.draw();
            if (drawable instanceof SoundProducable){
                ((SoundProducable)drawable).callSound();
            }










        }
    }
}
