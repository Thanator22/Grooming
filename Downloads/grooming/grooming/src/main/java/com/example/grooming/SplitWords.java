package com.example.grooming;

import java.util.Scanner;

public class SplitWords {

    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The number of words are: "+split(s));
    }
    public static int split(String s){
        String[] words = s.split(" ");

        for(String w:words)
            System.out.println(w);
        return words.length;
    }
}
