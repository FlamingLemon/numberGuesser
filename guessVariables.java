import java.util.Scanner;

public class guessVariables extends Main {
	
	public guessVariables() {
		
		super();
	}
	  
	
	  public void guess() {
	   int num = 0;
	   int secret = 102;
	   int boundary = 50;
		  
	   while (secret != num) {   
	            @SuppressWarnings("resource")
				Scanner myInput = new Scanner (System.in);
	            System.out.println("Enter a number: " );
	            num = myInput.nextInt();  
	         
	             if (num == secret) { 
	                System.out.println("Your good");
	            

	             } else if (secret < num)  { 
	                 if (num < secret + boundary) {
	                     System.out.println("your within " + boundary + " numbers");
	                 }
	                 System.out.println("Your too high");
	             } else  {
	                 System.out.println("Your too low");
	                if (num > secret - boundary) {
	                    System.out.println("your within " + boundary + " numbers"); 
	               } 
	           } 
	           
	        }
	  }
}
