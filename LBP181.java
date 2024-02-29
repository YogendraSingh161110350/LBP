sofia loved to play with the programs unfortunately. she got stuck in one of the questions. she tought to take help of james. james asked her the problem statement. The problem statement was.
"for the given string S of length N consist of stream of character not in predefined order. Write a program to find second non-repeating character in a string S. Write a program to help sofia and james for the given problem statements.

Input Format

string from the user

Constraints

no

Output Format

single character

Sample Input 0

gaahaajapsps
Sample Output 0

h
Sample Input 1

welcome
Sample Output 1

l
Sample Input 2

demo
Sample Output 2

e


import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch))
            {
                count++;
                if(count==2)
                {
                    System.out.print(ch);
                    break;    
                }
            }
        }
    }
}