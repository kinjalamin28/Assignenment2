package com.Task2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        String s1 = "Consultadd";
        String s2 = "Java Training";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = input.nextInt();


        if (num % 3 == 0 && num % 5 == 0)
        {
            System.out.println(s1+" "+s2);
        }else if (num % 3 == 0)
        {
            System.out.println(s1);
        }else if (num % 5 == 0)
        {
            System.out.println(s2);
        }
    }
}
