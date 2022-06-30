
package GradingCalc;



public class CalculatorYB {

	public static void main(String[] args) {

		int[] arr = {95, 85, 62, 40, 79};
	
		//Grades for Students
		
		System.out.println("Hi Student - Here is your Grading Scale Chart");
		System.out.println(
				
				"A: between 90 - 100 " +" \n" +
				"B: between 80 - 89  " +" \n" +
				"C: between 70 - 79  " +" \n" +
				"D: between 60 -  69 " +" \n" +
				"F: 59 and under");
		System.out.println();
		
		//start of for loop statement
		
		for(int i=0; i <arr.length; i++) {	
			
			//start of if statement
			if(arr[i]==95) {
	   System.out.println(arr[i] + " in Math got an A ");
		     } else if(arr[i]==85) {
		    System.out.println(arr[i] + " in English got a B ");
		     }else if(arr[i]==62) {
		    System.out.println(arr[i] + " in Science got a D");
		     }else if(arr[i]==40) {
		    System.out.println(arr[i] + " in History got a F");
		     }else if(arr[i]==79) {
		    System.out.println(arr[i] + " in Art got a C");
		     }
		     else {
		    	 System.out.println("No grade to report");
		     }
	

		}//end of for loop statement
		
		
	}//end of main
		
	
}// end of class



