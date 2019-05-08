/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False*/

package com.stackroute;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public String RegularExpression(String str, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
            System.out.println("Is " + word + " here? true");
        else
            System.out.println("Is " + word + " here? false");
        return null;
    }
    public static void main(String args[]) {
        RegularExpression obj = new RegularExpression();
        Scanner scn=new Scanner(System.in);
        obj.RegularExpression("httry","harry");
    }

}