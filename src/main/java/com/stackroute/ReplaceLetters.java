/*Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry*/
package com.stackroute;
public class ReplaceLetters {


    public static void main(String[] args) {
        String str = "I like dog";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');
        String new_str1 = new_str.replace('l', 't');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str1);
    }
}