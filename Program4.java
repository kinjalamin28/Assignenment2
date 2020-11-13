package com.Task2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter number :");
            a = input.nextInt();
            if (a <0) {
                System.out.println("It's over");
                break;
            }
            System.out.println("Good Going");
        }while (a>0);
    }
}
