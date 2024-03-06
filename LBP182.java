You are given an array of integers, N of size array length. Find the absolute difference (i.e. diff>=0) between the largest and smallest prime numbers.
Note:
1. if there are 1 or fewer prime numbers in array return 0.
2. the array may contain +ve and -ve numbers, ignore -ve numbers.
3. 1 and 0 are not prime.

Input Format

array size and array elements

Constraints

no

Output Format

absolute diff

Sample Input 0

5
1 2 3 4 5
Sample Output 0

3
Sample Input 1

5
1 -2 3 4 5
Sample Output 1

2
Sample Input 2

5
1 -2 -3 4 5
Sample Output 2

0




=========================SOLUTION================================

import java.io.*;
import java.util.*;

public class Solution
{
    private static boolean isPrime(int num)
    {
        if(num==1)
            return false;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++)
        {
           // System.out.println(isPrime(arr[i]));
            if(arr[i]>0 && isPrime(arr[i]) && min>arr[i])
            {
                min = arr[i];
            }
            if(arr[i]>0 && isPrime(arr[i]) && max<arr[i])
            {
                max = arr[i];
            }
        }
      
            if(max>min)
                System.out.print(max-min);
            else
                System.out.print(0);
    }
}