There are 3 friends named Ronaldo,Messi,Rooney who worked at a compnay. Given thier monthly salaries and monthly expendictures, returns the highest saving amoung them.

Input Format

single line with 6 space seperated integers.

Constraints

no

Output Format

highest saving amoung the 3 of them

Sample Input 0

10 7 15 10 15 11
Sample Output 0

5
Sample Input 1

100 50 100 90 100 99
Sample Output 1

50


==================Solution=====================





import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<=5;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<=5;i=i+2)
        {
            int saving = arr[i]-arr[i+1];
            if(max<saving)
            {
                max = saving;
            }
        }
        System.out.print(max);
    }
}

