/*
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*/

package com.company;

import java.util.Scanner;

public class ReverseWordInString {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            String str1 = scanner.next();
            reverseWord(str1);
        }
    }
    public static void reverseWord(String str1){
        String[] string = str1.split("[.]");
        for (int i = string.length-1; i >= 0; i--){
            if (i == 0){
                System.out.println(string[i]);
            }
            else {
                System.out.print(string[i] + ".");
            }
        }
    }
}
