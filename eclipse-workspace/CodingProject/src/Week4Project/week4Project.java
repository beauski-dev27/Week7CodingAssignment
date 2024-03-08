package Week4Project;

import java.util.ArrayList;

public class week4Project {

	public static void main(String[] args) {
 
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		int result = ages[ages.length - 1] - ages[0];
			System.out.println(result);
			
		// Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		// Make sure that there are 9 elements of type int in this new array. 
			
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 97};
		
		// Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
		
		int result2 = ages2[ages2.length- 1] - ages2 [0];
		System.out.println(result2);
		
		// Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		
		int [] averageAge = {3, 9, 23, 64, 2, 8, 28, 93, 97};
		
		int length = averageAge.length;
		
		int sum = 0;
		
		// Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		for (int i = 0; i < averageAge.length; i++) {
			sum += averageAge[i];
		}
		double average = sum / length;
		
		System.out.println("Average age is " + average);
		
		
		// Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum2 = 0;
		
		//  Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		for(int i = 0; i < names.length; i++) {
			sum2 = sum2 + names[i].length();
					}
		
		System.out.println("The average number of letters per name is: " + sum2/names.length);
		
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String allNames = " ";
		
		for (int i = 0; i < names.length; i++) {
			allNames = allNames + names[i] + " ";
		}
			System.out.println("Names entered are: " + allNames);
			
			// Accessing the last element of an array
			
			System.out.println("Last element of my array ages2 is: " + ages2[ages2.length - 1]);
			
			// Accessing the first element of an array
			
			System.out.println("First element of my array ages2 is: " + ages2[0]);
			
			// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			
			int [] nameLengths = new int[names.length];
			for (int i = 0; i < nameLengths.length; i++) {
				nameLengths[i] = names[i].length();
				System.out.println(nameLengths[i]);
			}
		
			// Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
			int sumOfNameLengths = 0;
			for (int nameLength : nameLengths) {
				sumOfNameLengths += nameLength;
			}
				System.out.println("Sum of all elements in nameLength array: " + sumOfNameLengths);
				
			// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		
				String word = "Hello";
				int count = 3;
				System.out.println("Word to repeat is: " + repeatWord(word,count));
		
				// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name		
				
				System.out.println(fullName());
				
				// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
				System.out.println(isSumGreaterThan100(ages));
				
				// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
				
				double[] numbers3 = {29.5, 46.4, 72.3, 92.1};
				System.out.println(getAverage(numbers3));
				
				// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
				
				double[] numbers4 = {22.5, 42.4, 75.3, 94.1};
				double[] numbers5 = {3.5, 10.2, 20.4, 32.3};
				System.out.println(greaterAverage(numbers4, numbers5));
				
				 // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				boolean isHotOutside = true;
				double moneyInpocket = 8.50;
				System.out.println(willBuyDrink(isHotOutside, moneyInpocket));
				
				// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
				int personOfAge = 22;
				System.out.println("Is this person allowed in the bar? " + isAllowed(personOfAge));
			
	} // End of Main 
	
	// Step 7
	public static String repeatWord(String word, int n) {
		String newWord = "";
		for (int i =0; i < n; i++) {
			newWord += word;
		}
		return newWord;
	}
	
	// Step 8
	public static String fullName() {
		String firstName = "Tom";
		String lastName = "Savage";
		String fullName = firstName.concat(" " + lastName); {
			
		} 
	    return fullName;
			
	}
	
	// Step 9
	public static boolean isSumGreaterThan100(int[] ages) {
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			
		}
		return sum > 100;
		
	}
	
	// Step 10
	public static double getAverage(double[] numbers3) {
		double sum = 0;
		for (int i = 0; i < numbers3.length; i++) {
			sum += numbers3[i];
		
	    }	
		double average = sum/numbers3.length;
		return average;
		
	}

	// Step 11
	public static boolean greaterAverage(double[] numbers4, double[] numbers5) {
		double sum = 0;
		for (int i = 0; i < numbers4.length; i++) {
			sum += numbers4[i];
		}
		double average1 = sum/numbers4.length;
		System.out.println(average1);
		
		double sum1 = 0;
		for (int i = 0; i < numbers5.length; i++) {
			sum1 += numbers5[i];
			
		}
		double average2 = sum1/numbers5.length;
		System.out.println(average2);
		
		if (average1 > average2) {
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	// Step 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInpocket) {
		if (isHotOutside == true && moneyInpocket > 10.50)
			return true;
	 else 
		return false;
	}

	// Step 13
	public static boolean isAllowed(int personOfAge) {
		if (personOfAge > 21) {
			return true;	
		} else {
		return false;
	}
			
}
	
}// End of Class

