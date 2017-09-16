/**
* @author : Millan Kaul
* @desc: Problem Statement: You have been given a String S.
*        You need to find and print whether this string is a palindrome or not.
*        If yes, print "YES" (without quotes), else print "NO" (without quotes).
*/

import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String chord = s.nextLine();
        int L= chord.length();
        String reverse = new String();
        for (int i = L-1; i >=0 ; i--) {
            reverse = reverse + chord.charAt(i);
        }
            if(chord.equals(reverse)) 
                {
                    System.out.println("YES");
                }
            else {
            System.out.println("NO");
        }
    }
}
