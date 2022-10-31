package com.chipmunk;
import java.lang.Object;
import java.text.NumberFormat;

public class variables {
    public static void main(String[] args){
        final float PI = 3.14F;
        double resul = (double)10/(double)3;
        int result = 10/3;
        result ++;
        //int result = 10+3;
        //implicit casting -> buyr->short->int->long
        String s = "11";
          //Integer.parseInt(s) takes string and return int
        int y = Integer.parseInt(s)+11;
        short x = 1;
        //String y = "x+1";

        NumberFormat curr = NumberFormat.getCurrencyInstance();
        String curr1 = curr.format(123123123);
        System.out.println(curr1);


    }
}
