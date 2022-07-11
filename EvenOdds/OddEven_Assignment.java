package EvenOdds;
import java.util.Scanner;


public class OddEven_Assignment {

	public static void main(String[] args) {
		
		
		Scanner fName1 = new Scanner(System.in);
		System.out.println("Hi, please enter your name");
	    String name= fName1.nextLine();			
		System.out.println(" Hi " + name);
		
	 
	
		Scanner reader1 = new Scanner(System.in);			
		  reader1.close();  
		System.out.print("Enter a number and I will tell you if it is odd or even ");
        int userInput = reader1.nextInt();
        
       
        if(userInput % 2 == 0)
            System.out.println("The number you entered " + userInput + " is an even number" );
        else
            System.out.println("The number you entered " + userInput + " is an odd number" );

 
        
	}	
}//end of class
