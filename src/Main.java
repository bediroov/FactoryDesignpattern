import factory.Myexception;
import factory.Shape;
import factory.Shapefactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Myexception {


        Shapefactory shapefactory = new Shapefactory();

        try {
            Shape shape1 = shapefactory.getshape("circle");
            shape1.draw();

            Shape shape2 = shapefactory.getshape("rectangle");
            shape2.draw();

            Shape shape3 = shapefactory.getshape("square");
            shape3.draw();

            Shape shape4 = shapefactory.getshape("trapesiya");
            shape4.draw();


        } catch (Myexception e) {
            System.out.println(e.getMessage());
        }




    }
}