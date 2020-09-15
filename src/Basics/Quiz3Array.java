package Basics;

public class Quiz3Array {

	public static void main(String[] args) {
		//integer array
        //Integer[] intArray = {10,20,30,40,50,60,70,80};
		int [] numbers = {5, -2, 0, 243, -182, 650};
		
		System.out.println("==========Finding the Minimum value==========");
		System.out.println("The Minimum value is: " + findMin(numbers));
		System.out.println("==========Finding the Maximum value==========");
		System.out.println("The Maximum value is: " + findMax(numbers));
		System.out.println("==========Finding the average value==========");
		System.out.println("The sum of the Array is: " +aver(numbers));
		
 
     //call printArray method by passing intArray as an argument        
//     printArray(intArray/2);
//     printMinumum(intArray);
//     printMaximum(intArray);
     
        //Instructor's Solution
        
}
	//method to print an array, taking array as an argument   
	/*
	 * private static int printArray(integer[] intArray){
	 * System.out.println("Array contents printed through method:"); //print
	 * individual elements of array using enhanced for loop for(Integer val:
	 * intArray) System.out.println((intArray) + " "); return 0; }
	 */
  
	/*private static void printMinumum(Integer[] intArray){
		
		 * System.out.println("====Print the Minimum Value===="); //print individual
		 * elements of array using enhanced for loop
		 * 
		 * System.out.println("The Minimum value is: " +Integer.min(10, 80) + " ");
		 */
          
	//Instructor solution
			//1. Finding the Minimum Value function
			  public static int findMin(int[] arr) { 
				  int min = arr[0]; 
			  for (int i = 0; i < arr.length; i++) { 
				  if (arr[i] < min) { 
					  min = arr[i]; 
					  } 
				  } return min;
			}
			  
		 //2. Finding the Maximum value function
			  public static int findMax(int[] arr) { 
				  int max = arr[0]; 
			  for (int i = 0; i < arr.length; i++) { 
				  if (arr[i] > max) { 
					  max = arr[i]; 
					  } 
				  } return max;
			}  
			  
		 //3. Find the average, first is to get the sum of the array numbers, then divide by the numbers
			  public static int aver(int [] arr) { 
										
					//Instructor's Solution
					int sum = 0;
					for (int i = 0; i < arr.length; i++) {
						sum = sum + arr[i];
					}
					return sum/arr.length;
				}
			  
		}

	/*
	 * private static void printAverage(Integer[] intArray){
	 * System.out.println("====Print the Average Value===="); //print individual
	 * elements of array using enhanced for loop
	 * 
	 * System.out.print("The average value is: "
	 * +Integer.sum(((printArray(intArray))/2) + " "));
	 
	}*/
	
	/*
	 * private static void printMaximum(Integer[] intArray){
	 * System.out.println("====Print the Maximum Value===="); //print individual
	 * elements of array using enhanced for loop
	 * 
	 * System.out.print("The Miximum value is: " +Integer.max(10, 80) + " "); }
	 */


