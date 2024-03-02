You are given a list of integers of size N, write an algorithm to sort the first K elements of the list in ascending order and the remaining elements in descending order.

Input Format

an arry size and elements

Constraints

no

Output Format

updated array

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 2 5 4 3
Sample Input 1

8
1 8 2 7 3 6 4 5
Sample Output 1

1 2 3 4 8 7 6 5


================Solution

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]>arr[j] && i<n/2 )
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else if(arr[i]<arr[j] && i>=n/2)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}