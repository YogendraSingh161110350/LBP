import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number rectangle");
		int numOfRect = sc.nextInt(); //
		
		for(int i = 0;i<numOfRect;i++)//i = 0
		{
			System.out.print("enter width:");
			int width = sc.nextInt();//10
			System.out.print("enter height:");
			int height = sc.nextInt();//50
			System.out.println(areaOfRect(width,height));
		}
	}

	static int areaOfRect(int width,int height)
	{
		return width*height;
	}
}