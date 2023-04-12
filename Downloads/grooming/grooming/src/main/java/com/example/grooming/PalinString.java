package com.example.grooming;

public class PalinString {
    public static void checkPalin(String s)
    {
        char[] ch = s.toCharArray();
        for (int i = 0; i <= s.length()/2; i++) {
            if(ch[i]!=ch[s.length()-1-i])
                System.out.println("Not a Palindrome String");
        }
        System.out.println("Voila!! A palindrome string");
    }
}
