One programming language has the following keywords that cannot be used as identifiers. break,case,continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var
write a program to find if the given word is a keyword or not.

Input Format

string from the user

Constraints

con

Output Format

true or false

Sample Input 0

defer
Sample Output 0

true
Sample Input 1

class
Sample Output 1

false
Sample Input 2

default
Sample Output 2

true




import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
      String str1 = "break,case,continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var";
      Scanner sc = new Scanner(System.in);
      String str2  = sc.nextLine();
      if(str1.contains(str2))
          System.out.print("true");
       else
           System.out.println("false");
    }
}