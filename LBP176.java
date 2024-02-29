Implement a program to read two integers values and return GCD of two numbers.

Input Format

two space seperated integers.

Constraints

no

Output Format

GCD of two numbers

Sample Input 0

98 56
Sample Output 0

14
Sample Input 1

2 3
Sample Output 1

1

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int min = Math.min(n1,n2);
        int gcd = 1;
        for(int i=1;i<=min;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
}