package com.example.demo.java.algo.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaximumNumberPossibleByAddingOneDigit {

    //Find the largest set of number from the given integer
    private static Boolean digitAdded = false;

    public static void main(String[] args) {

//        Integer[] dig = getDigit(176543);
//        Integer[] dig = getDigit(765543);
//        Integer[] dig = getDigit(176543);

//        System.out.println(Arrays.toString(dig));

//Method 2
        String number = String.valueOf(-9999);
        String[] digits2 = number.split("");

        List<String> stringList=new ArrayList<>(2);

        Boolean numberAdded=false;

        String largestNumber="";

        for (int i = 0; i < digits2.length; i++) {

            if (!numberAdded){
                if (digits2[i].compareTo("5")<=0){
                    stringList.add("5");
                    largestNumber+="5";
                    numberAdded=true;
                }

            }
            largestNumber+=digits2[i];
            stringList.add(digits2[i]);
        }

        System.out.println(stringList);
        System.out.println(largestNumber);

    }

    private static void collectDigit(int num, List<Integer> digit) {

        if (num / 10 > 0) {

            collectDigit(num / 10, digit);

        }

        if (!digitAdded) {
            if (num % 10 <= 5) {
                digit.add(5);
                digitAdded = true;
            }
        }

        digit.add(num % 10);

        System.out.println(num % 10);

    }

    private static Integer[] getDigit(int num) {
        List<Integer> digits = new ArrayList<>();
        collectDigit(num, digits);
        System.out.println(digits);
        return digits.toArray(new Integer[]{});
    }


}
