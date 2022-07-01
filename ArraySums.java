package Arrays;



public class ArraySums {

	public static void main(String[] args) {
	
       int testSumNumber[]= {1,4,7,25,102,15,98,100,250};
       cal(testSumNumber);
	
		System.out.println(cal(testSumNumber));
	
	}//end of main

   
	 
	public static int cal(int sumValues[]) {
		
		int sumNumber = 0;
		for(int i=0; i<sumValues.length; i++)
		  sumNumber= sumNumber +sumValues[i];
		
		return sumNumber;
		
	}
		
		
		
		
	

	
}// end of class

