package com.chipmunk;

import java.awt.*;
import java.util.Date;

public class Main {
    static String theFrist = "mamamamamama!!";

    public static void main(String[] args) {
        String message = "new String"; //this is reference type which looks like primitive
        System.out.println(theFrist.endsWith("!!"));
        System.out.println("the length "+ message.length());
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x  = 2;
        System.out.println(point2 );
        byte age = 30;
        Date now = new Date(); /*instance of a new class, we allocated memory for that*/
        now.getTime(); //getNow methods of the class Date
        System.out.println(now);
        /*
        String age = "30";
        int someNew = Integer.parseInt(age);
        if (someNew == 30) {
            age = '11';
        }*/
	    //System.out.println(someNew);
        System.out.println(age);
    }
}
