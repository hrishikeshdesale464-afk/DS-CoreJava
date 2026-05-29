package basics;

import java.util.Scanner;

public class assingment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Assignment No.1
		 factorial with user input
		 Fibonacci series with user input
		 Even Odd with user input
		 Find Greatest with user input
		 
		 */
		
		//Factorial with user input
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int k=sc.nextInt();
		int f=1;
		for(int i=1; i<=k; i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of"+k+" is "+(f));		
		
		
		//Fibonacci series with user input
	
		System.out.println("Enter a Range ");
		int n1=0,n2=1,n3,b=sc.nextInt();
		  for(int i=1;i<=b;i++)
		  {
			  n3=n1+n2;
			  System.out.println(n3);
			  
			  n1=n2;
			  n2=n3;
		  }
		
		
		// Even Odd with user input
		
		   System.out.println("Enter a Number ");
        int c=sc.nextInt();
        {
        if(c%2==0)
        {
           System.out.println(c+" Number is even ");
        }
        else
        	
        	   System.out.println(c+" Number is odd ");
        }

		
        //Find Greatest with user input
        
        System.out.println("Find the gretest number");
        int p=sc.nextInt();
        int q=sc.nextInt();
        
        if (p>q)
        {
        	System.out.println(p+" is greater than "+q);
        }
        else
        {
        	System.out.println(q+" is greater than "+p);
        }
        
       
	}

}
