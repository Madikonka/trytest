package com.chipmunk;

import java.util.Arrays;
import java.util.ArrayList;

public class PlayingCode {
      static int[] arrayS;

        public PlayingCode(int[] arr) {
        arrayS = arr;
      }

        public static int sum(int[] arr){
            System.out.println(Arrays.toString(arr));
            int sumI = 0;
            for(int i = 0; i<arr.length; i++){
                if (arr[i]>0) {
                    sumI += arr[i];
                }
                else {
                    continue;
                }
            }
            System.out.println(sumI);
            return sumI;
        }

       public static void division(int[] arr){
        System.out.println("Division method");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr.length);
        }
      }


     public static int[] sme = {};
     public static int[] sme1 = {1,1,1,1,1,1,1,1};
     public static void main(String[] args) {
         PlayingCode summa = new PlayingCode(sme);
         //System.out.println(summa.sum(sme));
         summa.sum(sme);
         System.out.println("summa");

         PlayingCode summa1 = new PlayingCode(sme);
         //System.out.println(summa1.sum(sme1));
         summa1.sum(sme1);
         summa1.division(sme1);
         System.out.println("summa1");

         this.division(sme1);

    }

}
