package com.example.grooming;

import java.util.Scanner;

public class StringInput {
    public static String input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        return(sc.nextLine());
    }
}
