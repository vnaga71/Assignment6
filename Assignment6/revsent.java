/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author venka
 */
import java.util.Scanner;

// Java Program to reverse a String 
// without using inbuilt String function 
import java.util.regex.Pattern;

public class revsent {

    static String reverseWords(String str) {

        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
            } else {
                result = " " + temp[i] + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "Welcome to zoho";
        System.out.println(reverseWords(s1));

        String s2 = "I love learning";
        System.out.println(reverseWords(s2));
    }
}
