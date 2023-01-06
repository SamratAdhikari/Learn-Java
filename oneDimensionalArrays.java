import java.util.Arrays;

public class oneDimensionalArrays{
	public static void main(String args[]){
		// if we know the no of items in the array
		int[] numbers1 = new int[5];
		numbers1[0] = 9; 
		numbers1[1] = 7;

		System.out.println(Arrays.toString(numbers1));


		// if we dont know the no of items in the array
		int[] numbers2 = {9, 4, 5, 1, 3};

		int lenNumbers = numbers2.length; // getting length of our array
		System.out.println(lenNumbers);

		Arrays.sort(numbers2); // sorting the array
		System.out.println(Arrays.toString(numbers2));

		System.out.println();		 
	}
};