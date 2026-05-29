package homepractice;

import java.util.Scanner;

public class Fibonacciseriesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonacciseries
		
		int n1=0,n2=1,n3,b=12;
		
		for(int i=1; i<=b; i++)
		{
			n3=n1+n2;
			System.out.println(n3);
		
		   n1=n2;
		   n2=n3;
		}
		
		//With User Input
	
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a Range");
		int s1=0,s2=1,s3,f=sc.nextInt();
		for(int i=1; i<=f;i++)
		{
			s3=s1+s2;
			System.out.println(s3);
			
			s1=s2;
			s2=s3;
		}
		
	}

}
