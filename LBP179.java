given an array of size n, write a function to rearrange the numbers of the array in such that even and odd numbers are arranged alternatively in increasing order.

Input Format

array size n and elements

Constraints

no

Output Format

updated array

Sample Input 0

4
1 2 3 4
Sample Output 0

2 1 4 3
Sample Input 1

6
1 2 3 4 5 6
Sample Output 1

2 1 4 3 6 5







import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
                arr[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i%2==0 && arr[j]%2==0)
                {
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                    break;
                }
                else if(i%2==1 && arr[j]%2==1)
                {
                     int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        for(int a:arr)
            System.out.print(a+" ");
    }
}