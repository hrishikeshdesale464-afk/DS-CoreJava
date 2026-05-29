package basics;

import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

	
		//String is non primitive datatype
		//String is immutable
		//String max length is 2'32-2
		//String is char array
		
		String a="have a good day";
		String b="Have a Good Day";
		
		//charAt is predefined method used to find indexing of characters
		for(int i=0;i<a.length();i++)
		
		{//                     Position  1   Value     a
			System.out.println("Position"+i+" Value "+a.charAt(i));
		}

		//trim function is used to remove or trim extra space from the character
		System.out.println(a.trim());
		
		//replace function is used to replaced existing word with new or update words
		System.out.println(a.replace("day","evening"));
		
		//toUppercase is predifed method is used to convert all char to capital letters
		System.out.println("UPPER CASE DATA:-"+a.toUpperCase());
		
		//toLowercase is predifed method is used to convert all char to lower case
		System.out.println("UPPER CASE DATA:-"+b.toLowerCase());
		
		//substring is predefined method used to get values from the variable
		//with help of start index and end index
		System.out.println(a.substring(3,10));
		
		//contains is predefined method of String which checks whether give data exist in variable 
		//or not
		if(a.contains("good"))
		{
			System.out.println("Match Found for good data");
		}
		else
		{
			System.out.println("Match not Found for good data");
		}
		
		//startsWith is predefined method of string which checks whether first given data starts
		//with the given characters are not
		if(b.startsWith("Have"))
		{
			System.out.println("Data had have word");
		}
		else
		{
			System.out.println("Data does not Have word");
		}
		
		//endsWith is predefined method of String which checks that the ending characters are
		//getting matched or not
		if(b.endsWith("Day"))
				{
					System.out.println("Match successfully ");
				}
				else
				{
					System.out.println("Did not Matched ");
				}
		
		//equals is predefined method of string
		//equal it is used to check whether a data get matched or not
		//equal method also check uppercase and lowercase or not
		if(a.equals(b))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found");
		}
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found");
		}
		
		System.out.println("Enter your name:- ");
		String n=sc.nextLine();

		//next() is predefined method of Scanner class
		//it is used to store only first single word in variable
		System.out.println("Welcome "+n);

		//nextLine is predefined method of Scanner class
		//it is used to store all characters given by user in variable
		
		
		//Assignment
		//Enter pin code
		//12344 - invalid
		//please enter pin again
		//3445 - invalid
		//please enter pin again
		//455566
		//Acc blocked
		
		System.out.println("Enter pin number");
		String g=sc.next();  //234

		String h="123456";
//		          3<=3
		for(int i=1;i<=3;i++)
		{
		    if(i<=2) //3<=2
		    {
		        if(h.equals(g))  //123456==456
		        {
		            System.out.println("Pin is valid");
		            
		        }
		        else
		        {
		            System.out.println("Pin is invalid");
		            System.out.println("Please enter pin again");
		            g=sc.next();  //678
		        }
		    }
		    else if(i==3) //3==3
		    {
		        System.out.println("Acc is blocked");
		    }
		}
		
		
		
	}

}
