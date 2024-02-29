You are given an array of integers, a of size n, Your task is to find the number of elements whose positions will remain unchanged after sorted in ascending order.

Input Format

array size and elements

Constraints

no

Output Format

unchanged count

Sample Input 0

5
1 2 5 3 4
Sample Output 0

2
Sample Input 1

10
1 10 2 9 3 8 4 7 5 6
Sample Output 1

1


============================solution
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }    
        int num = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr1[i]==arr2[i])
            {
               num=arr1[i];
               
            }
                
        }
        System.out.print(num);
    }
}