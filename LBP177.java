Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits.

Input Format

a number from the user

Constraints

no

Output Format

an integer

Sample Input 0

12
Sample Output 0

1
Sample Input 1

123
Sample Output 1

-2


A spy wants to send some secret information to the government. As the data is very important, he encrypts the message by encoding by adding some extra characters. the original message has only upper case letters and numbers, while the extra characters are madeup of lowercase letters and special characters. Can you help the receiver in designing a program that accepts the message and returns the secret information.

Input Format

a string from the user

Constraints

no

Output Format

original message

Sample Input 0

Wel1c%OmE
Sample Output 0

W1OE
Sample Input 1

pRak123aSh
Sample Output 1

R123S
Sample Input 2

dEmO
Sample Output 2

EO

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='0'&&ch<='9') || (ch>='A'&&ch<='Z'))
            {
                System.out.print(ch);
            }
        }
    }
}