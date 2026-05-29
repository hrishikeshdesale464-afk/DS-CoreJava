package basics;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonacci Series
		
		//Working of Fibonacci Series
		
          /*           
		               1      		
		              1 1
		             1 2 1
		            1 3 3 1
		           1 4 6 4 1
		           
           */         
	
	       int n1=0,n2=1,n3,b=10;
				  for(int i=1;i<=b;i++)
				  {
					  n3=n1+n2;
					  System.out.println(n3);
					  
					  n1=n2;
					  n2=n3;
				  }

				  
	}

}
