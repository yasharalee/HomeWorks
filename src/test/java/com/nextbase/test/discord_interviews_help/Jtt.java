package com.nextbase.test.discord_interviews_help;

import java.util.Arrays;

public class Jtt {
    public static void main(String[] args) {
        String a = "DC501GCCCA098911ghghu90";
        System.out.println(sortIt(a));
    }

    private static String sortIt(String str) {
        String dummy = "";
        String ready = "";
        for (int i = 0; i < str.length(); i++) {
            String letter = "" + str.charAt(i);

            boolean currentLetterIsDigit = isDigit(letter);


            if (currentLetterIsDigit && (isDigit(dummy) || dummy.isBlank()) ||
                    (!currentLetterIsDigit && (!isDigit(dummy) || dummy.isBlank()))) {
                dummy += letter;
            } else if (currentLetterIsDigit && !isDigit(dummy) ||
                    (!currentLetterIsDigit && isDigit(dummy))) {
                ready += sortStr(dummy);
                dummy = letter;
            }
            if (i == str.length() - 1) {
                ready += sortStr(dummy);
            }

        }
        return ready;
    }

    public static String sortStr(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean isDigit(String s) {
        boolean is = true;
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    is = false;
                }
            }
        } else {
            return false;
        }
        return is;
    }
}
