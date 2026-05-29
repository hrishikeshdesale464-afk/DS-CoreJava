package basics;

import java.util.Arrays;
import java.util.Scanner;

public class arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		//Arrays is collection of multiple elements.
		//        0, 1,2
		int a[]= {12,3,4,67,45,23,98};
		
		System.out.println(a.length);
		
		//  i=1       0<a
		for(int i=1; i<a.length; i++)
		{//                   Position  1   value   0
			System.out.println("Position"+i+" value "+a[i]);
		}
		
		
		// with user input
		int b[]=new int[4];
		
		System.out.println("Enter any 4 number:-");
		b[0]=sc.nextInt();
		b[1]=sc.nextInt();
		b[2]=sc.nextInt();
		b[3]=sc.nextInt();
		
		System.out.println(Arrays.toString(b));
		
		//copyOf
		//copyOf is predefined method of arrays
		//it is used to copy the data of existing array to the newest array variable
		
		int e[]= {10,20,30,40};
		 
		 int n[]=Arrays.copyOf(e, 4);
		 
		 System.out.println("Arrays data of e variable;-"+Arrays.toString(e));
		
		 System.out.println("Arrays data of n variable;-"+Arrays.toString(n));

		 
		// Arrays is predefined class for java.util package
		// ToString is used to print all the values together
	    // ToString is also used to prevent garbage values
	    // ToString is predefined method of arrays
		
		//Enter 12 numbers
		 
		System.out.println("Enter any length you want");
		int g=sc.nextInt();
		
		int c[]=new int[g];
		System.out.println("Enter any"+c.length+"number");
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(c));
		
		
		
		//Assignment
		//Even Odd number using arrays- [12,13,78,89,34,23]
		
		int h[]= {12,13,78,89,34,23};
		
		System.out.println(h.length);
		
		for(int i=0; i<h.length; i++)
		{
			
	        if(h[i]%2==0)
	        {
	           System.out.println(h[i]+" Number is even ");
	        }
	        else
	        	
	        	   System.out.println(h[i]+" Number is odd ");
	        }
		
		
		
	}

}
