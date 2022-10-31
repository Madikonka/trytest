package com.chipmunk;

import java.text.NumberFormat;
import java.util.Scanner;

public class inputoutput {

    public static void main(String[] agrs){
        Scanner calculator = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = calculator.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualIR = calculator.nextFloat();
        System.out.print("Mortgage: ");
        byte period=calculator.nextByte();
        float monthIR=annualIR/12000;
        int n=period*12;
        double payment = principal*(monthIR*Math.pow((1+monthIR),n))/
                (Math.pow((1+monthIR),n)-1);
       // NumberFormat curr = NumberFormat.getCurrencyInstance();
        String paymentpercent = NumberFormat.getCurrencyInstance().format(payment);
        System.out.println("payment  " + paymentpercent);
    }
}