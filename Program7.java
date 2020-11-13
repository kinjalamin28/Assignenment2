package com.Task2;

import java.util.Scanner;
import java.math.*;

import static java.lang.Math.abs;

public class Program7 {
    public static void main(String[] args) {
        String s1 = "Positive";
        String s2 = "Negative";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        float n = input.nextFloat();
        if(n==0)
        {
            System.out.println("Zero");
        }else if (n>0) {
            System.out.println(s1+" "+absolute(n));
        }
        else
            System.out.println(s2 + " " + absolute(n));

    }
    public static String absolute(float f){
        String s="";
        if(abs(f) <1) {
            s ="Small";
        }
        if(abs(f) > 1000000){
             s ="Large";
        }
        return s;
    }

}
