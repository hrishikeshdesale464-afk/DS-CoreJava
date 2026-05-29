package homepractice;

import java.util.Scanner;

public class ifelsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If Else
		
		//Simple If Else
		//Multiple If Else
		//Nested If Else
		
		//Simple If Else
		
		//Even Odd Number
		
		int d=6;
		
		if(d%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
			
			
			//With User Input
			
			Scanner sc=new Scanner(System.in);
			int y=sc.nextInt();
			
			System.out.println("Enter a Number");
			if (y%2==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is Odd");
			}
			
			//Multiple If Else
			
			int j=76,k=76;
			if(j>k)
			{
				System.out.println(j+"is greater than"+k);
			}
			else if(j>k)
			{
				System.out.println(k+"is greater than"+j);
			}
			if(j==k)
			{
				System.out.println("Both are equals");
			}

			//With user input
			
			System.out.println("Enter a Number");
			j=sc.nextInt();
			k=sc.nextInt();
			
			if(j>k)
			{
				System.out.println(j+"is greater than"+k);
			}
			else if(j>k)
			{
				System.out.println(k+"is greater than"+j);
			}
			if(j==k)
			{
				System.out.println("Both are equals");
			}

			
			
			
			
			
		}
	}

}
