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
// java program to reverse a word
import java.io.*;
import java.util.Scanner;

public class reversecharater  {

    public static void main(String[] args) {

        String str = "zoho", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Zoho");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }
}
