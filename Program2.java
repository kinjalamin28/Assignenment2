package com.Task2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        float ans=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose one option:");
        System.out.println("1 - Addition\n2 - Subtraction\n3 - Division\n4 - Multiplication\n5 - Average");
        int choice = input.nextInt();

        System.out.print("Enter first number :");
        float first = input.nextFloat();
        System.out.print("Enter Second number :");
        float second = input.nextFloat();

        switch (choice)
        {
            case 1 :
                ans = first+second;
                System.out.println("Addition of two number : "+ans);
                break;
            case 2 :
                ans = first-second;
                System.out.println("subtraction of two number is : "+ans);
                break;
            case 3 :
                ans = first/second;
                System.out.println("division of two number is :"+ans);
                break;
            case 4:
                ans = first*second;
                System.out.println("Multiplication od two number is "+ans);
                break;
            case 5:
                System.out.println("enter two more numbers");
                float first1 = input.nextFloat();
                float second1 = input.nextFloat();
                ans = (first+second+first1+second1)/4;
                System.out.println("Average is "+ans);
                break;
            default:
                System.out.println("incorrect choice...");
                break;

        }
        if(ans <0){
            System.out.println("Oops option "+choice+" is returning the negative number");
        }



    }
}
