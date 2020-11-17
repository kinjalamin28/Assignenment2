package com.Task2;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        char[] pool = {'r','a','n','d','o','m','R','A','N','D','O','M'};
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);
        for (int i =0;i<pool.length;i++)
        {
            if (c == pool[i]) {
                System.out.println("Found");
                flag = 1;
                break;
            }
        }
        if(flag==0)
        System.out.println("Not Found");
    }
}
