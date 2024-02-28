The cosmetic company "BeauityMe" wishes to know the alphabetic product code from the product barcode. The barcode of the product is a numeric value and the alphabeitc product is a string value tagged 'a-j'. The alphabetic range 'a-j' represents the numeric range '0-9'. To produce the alphabetic product code. each digit in the numeric barcode is replace by the corresponding matching letters.
Write an algorithm to display the alphabetic product code from the numeric barcodes.

Input Format

an integer value

Constraints

no

Output Format

a character

Sample Input 0

abc
Sample Output 0

012
Sample Input 1

cdef
Sample Output 1

2345



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            System.out.print(ch-65);
        }
    }
}