package com.Task2;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if(n%2 == 0)
        {
            if(n>=2 && n<=5)
                System.out.printf("OLD");
            else if(n>=6 && n<=30)
                System.out.println("NEW");
            else if (n>30)
                System.out.println("OLD");

        }
        else
            System.out.println("NEW");

    }
}
