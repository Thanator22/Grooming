package com.example.grooming;

public class SubRep {
    static void modifyString(String s, String s1, String s2)
    {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            int k = 0;
            if (s.charAt(i) == s1.charAt(k)
                    && i + s1.length() <= s.length()) {

                int j;

                for (j = i; j < i + s1.length(); j++) {

                    if (s.charAt(j) != s1.charAt(k)) {
                        break;
                    }
                    else {
                        k = k + 1;
                    }
                }

                if (j == i + s1.length()) {
                    ans += (s2);
                    i = j - 1;
                }

                else {
                    ans += (s.charAt(i));
                }
            }

            else {
                ans += (s.charAt(i));
            }
        }

        System.out.print(ans);
    }
}
