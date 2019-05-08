/*/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string*/
package com.stackroute;
 import java.util.Scanner;
 public class CharacterOccuranceCount {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scan.next().toLowerCase();
        System.out.println("Enter a character to count in the string " + s);
        char count = scan.next(".").toLowerCase().charAt(0); // This logic is to read
        // only one character
        int countnumber = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count == s.charAt(i)) {
                countnumber++;
            }
        }
        System.out.println(count + " occurs " + countnumber + " times in " + s);
        scan.close();
    }
}