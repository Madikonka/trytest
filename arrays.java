package com.chipmunk;

import java.util.Arrays;
import java.util.Arrays;
import java.util.ArrayList;



public class arrays {


    public static ArrayList<String> addtoys(ArrayList<String> toys) {
        for (int i = 0; i < 10; i++) {

            toys.add("Anew" + i);
        }
        System.out.println(toys);
        return toys;
    }


    public static void main(String[] args) {

        // Initializing:
        //ages = new ArrayList<Integer>();
        ArrayList<String> toys = new ArrayList<String>();
    }
}

       /* int[] nus = {22,33,55,25,66};
        System.out.println(nus.length);
        Arrays.toString(nus);
        Arrays.sort(nus);
        System.out.println(Arrays.toString(nus));

        int[][]numbers = {{12,1,44},{44,55,33}};
        numbers[0][0] = 1;
        Arrays.deepToString(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.deepToString(numbers));
*/
  /*      int[] arrayNum = {22,33,44,55,66,44};
        for (int i = 0; i<5; i++){
            System.out.println(arrayNum[i]);
        }

        int i = 5;
        while (i>0){
            System.out.println("something"+ Integer.toString(i));
            i--;
        }
        // do will be executed at least once
        i = 6;
        do{
            System.out.println("something11"+ Integer.toString(i));
            i--;
        }while (i>0);

        // every item in string array is string
        String[] fruits = {"pear", "apple", "kiwi", "mango", "orange"};
        // proidet po vsem items
        for (String fruit:fruits){
            System.out.println(fruit);
        }

   */
