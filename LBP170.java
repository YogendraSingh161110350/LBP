Implement a program to convert the given matrix into array

Input Format

matrix of size mxn and elements

Constraints

one D array is required

Output Format

one-D array should be printed on screen

Sample Input 0

1 1
1
Sample Output 0

1
Sample Input 1

2 2
1 2
3 4
Sample Output 1

1 2 3 4




import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int arr[][] = new int[n][m];
      for(int i = 0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              arr[i][j] = sc.nextInt();
              System.out.print(arr[i][j]+" ");
          }
      }  
    }
}