package basics;

public class methodsdemo {
	

	/*
	// Method should be created outside main method but inside the class
    // Methods are of 4 types:
    // 1. BASIC METHOD (NON STATIC METHOD)
    // 2. METHOD WITH PARAMETERS
    // 3. METHOD WITHOUT VOID
    // 4. STATIC METHOD
    */
   
	// Basic Method
    public void add() // declaration of method
    {
        // body of method
        int a = 4, b = 5;
        System.out.println("Addition is " + (a + b));
    }

    public void sub()
    {
        int a = 4, b = 5;
        System.out.println("Sub " + (a - b));
    }

    //Method with Parameters
    public void sub(int a, int b, int c, int d) 
    //in round brackets what are write that is called parametres
	
    {
    	System.out.println("Sub:-"+(a-b-c-d));
    }
    
    //Method without void
    public int mul(int c, int d)
    {
    	return c*d;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub


	        methodsdemo m = new methodsdemo();

	        // call
	        m.sub(45,5,3,2);
	        m.add();
            System.out.println("Mul:-"+m.mul(25, 5));
	        
            // CLASSNAME objectname = new CLASSNAME();
	        // objectname.METHOD_NAME();
	    
	}
		
}	
		
		
		
		
		
		
	


