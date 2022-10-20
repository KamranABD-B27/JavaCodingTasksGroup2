package week4;

/*
Write a return method that check if a string is build out of the same letters as another string. Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

import java.util.Arrays;
import java.util.TreeSet;

//Solution#1:
public class SameLetters {
        public static void main(String[] args) {

            Same("abc", "cba");
            sameWithDuplicates("abc", "abbbccc");
        }

        public static boolean Same (String str1, String str2) {
            int count1 = 0;
            int count2 = 0;
            boolean lettersSame = false;

            for (int i = 0; i < str1.length(); i++) {
                count1 += str1.charAt(i); // summarises ASCII numbers of str1 characters
            }
            for (int i = 0; i < str2.length(); i++) {
                count2 += str2.charAt(i); // summarises ASCII numbers of str2 characters
            }

            if (count1 == count2) {
                lettersSame = true;
            }

            System.out.println(lettersSame);
            return lettersSame;
        }
// Solution #2:
// This one allows duplicates of the same characters, e.g. (Str1 = "abc"; Str2 = "abccccc").
            public static boolean sameWithDuplicates(String str3, String str4) {
            boolean same2;
                str3 = new TreeSet<String>(Arrays.asList( str3.split("") ) ).toString( );
                str4 = new TreeSet<String>(Arrays.asList( str4.split("") ) ).toString( );
                same2 = str3.equals(str4);
                System.out.println(same2);
                return same2;
            }
        }

