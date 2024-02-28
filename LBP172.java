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




import java.io.*;
import java.util.*;

public class Solution
{
    private static int result(int num)
    {
        int count = 0;
        int sum1=0;
        int sum2 = 0;
           while(num!=0)
           {
               count++;
               int rem = num%10;
               if(count%2==1)
                   sum1+=rem;
               else
                   sum2+=rem;
               num/=10;
           }
        int sum = sum1-sum2;
        if(count%2==1)
            return -(sum);
        else 
            return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(result(num));
    }
}