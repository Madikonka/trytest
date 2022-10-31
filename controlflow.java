package com.chipmunk;

import java.util.Scanner;

public class controlflow {
    public static void main(String[] args){
        Scanner incomingvalues = new Scanner(System.in);
        ///////fizzbuzz

        System.out.println("what's your num? ");
        int num = incomingvalues.nextByte();
        if (((num % 5)==0) && ((num % 3)==0)){
            System.out.println("FizzBuzz");
        }
        else if (((num % 5)==0) && ((num % 3)!=0)){
            System.out.println("Buzz");
        }
        else if (((num % 5)!=0) && ((num % 3)==0)){
            System.out.println("Fizz");
        }
        else System.out.println(num);

        System.out.println("what's your income? ");
        int income = incomingvalues.nextInt();
        boolean hasHI = income>10000;

        ////////// if hasHI then 22 else 44
        int temp = hasHI ? 22:44;
       // boolean isEligible = hasS && !hasT;
        //You can use it as a static function of the Integer class like this:
        //Integer.toString(123)
       /* if (something>55) {
            temp = 44;
        }
        System.out.println("the final result "+Integer.toString(temp));
        */
        ////////switch
        System.out.println("what's your role? ");
        String role = incomingvalues.next();
        switch (role){
            case "admin":
                System.out.println("You are an"+ role);
                break;
            case "moderator":
                System.out.println("You are an"+ role);
                break;

        }

    }
}
