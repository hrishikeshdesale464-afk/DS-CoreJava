package basics;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Simple If Else
		//Multiple If Else
		//Nested If Else
		
		//Simple If Else 
		
		//Even Odd number 
		int a=4;
		// % is modulus
		//modulus means it consider remainder as a result
		
		// 1==0
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		
		//Multiple If Else
		
		int c=89,d=89;
		
		if(c>d)
		{
			System.out.println(c+" is greater than"+d);
		}
		else if(c > d)
		{
			System.out.println(d+" is greater than"+c);
		}
		else if(c==d)
		{
			System.out.println("Both are equals..");
		}
		
		//Simple If Else 
		//with user input
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println("Enter a Number ");
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		//Multiple If Else
		//with user input
		
		System.out.println("Enter a Number ");
        int q=sc.nextInt();
        int l=sc.nextInt();
        
		
		if(q>l)
		{
			System.out.println(q+" is greater than"+l);
		}
		else if(q > l)
		{
			System.out.println(l+" is greater than"+q);
		}
		else if(q==l)
		{
			System.out.println("Both are equals..");
		}
		
	}

}
