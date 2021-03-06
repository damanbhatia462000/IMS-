package exceptionsdemo;

import java.util.Scanner;

public class Divisiondemo {

	public static void main(String[] args) {
		
		 int a, b, result;
         Scanner input = new Scanner(System.in);
        
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();  // enter 0
          
          try	//statements to be monitored which may throw an exception 
          {
        	 result=a/b;
        	 System.out.println("Result ="+ result);
          }
          
          catch(ArithmeticException e)	//Exception is handled in catch block
          {
        	  System.out.println("Divided by Zero Error- Enter non-zero value");
        	  System.out.println("Exception Description :"+e.getMessage());
        	  System.out.println("Exception Name & description :"+ e.toString());
        	  
        	  //Details about exception name, description, line number of code which 
        	  //generated exception
        	  
        	  e.printStackTrace();
    
          }
          
          finally 	//clean-up operations
          {
        	  input.close();
        	  System.out.println("In Finally, Block-Program execution ended");
          }
	
         
         result = a / b;  // JRE Throws Arithmetic exception
        
         System.out.println("Result = " + result);
         input.close();
	}

}
