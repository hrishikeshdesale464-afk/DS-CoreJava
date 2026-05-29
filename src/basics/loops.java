package basics;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Loops are 3 types:-
		//1. WHILE LOOP
		//2. DO WHILE LOOP
		//3. FOR LOOP
		
		
		//1. WHILE LOOP
		
		System.out.println("---WHILE LOOP----");
		
		int a=1;
		 while (a<=10)
		 { 
				System.out.println(a);
				a++;
		 }
		
		
		//2. DO WHILE LOOP
			
		 System.out.println("---DO WHILE LOOP----");

			int b=1;
			
			do
			{
				System.out.println(b);
				b++;
			}
			while(b<=10);
			
				
		//3. FOR LOOP
			
		System.out.println("---FOR LOOP----");

		for(int i=1; i<=10; i++)	
		{
			System.out.println(i);
		}
	
		System.out.println("---REVERSE PRINT----");
       
		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
		
	
		
	}


}
