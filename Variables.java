
import java.util.Date; // for Date datatype
import java.awt.*; // for Point datatype

public class Variables {
	public static void main(String args[]){

		// Primitive Data Types
		byte age = 19;
		int viewCount = 123456789;
		int moneyCount = 123_456_789; // more readable
		long moreMoney = 9_123_456_789L; // l or L: java sees the numbers as int
		float price = 10.99f; // f or F: java sees the numbers as double
		char letter = 's';
		boolean isEligible = true;

		// Reference Data Types
		String msg = "Hello Guys"; // Short of String msg = new String("Hello Guys")
		Date now = new Date(); // new operator to allow memory for 'now' variable


		// Differences between Primitive and Reference Datatypes

		// 1. Primitive DTs dont have methods, Reference DTs are classes and have methods 
		// age.sth(); // not possible
		now.getTime(); // using method

		// 2. In PDTs, variables are independent, In RDTs, variables are dependent
		byte a = 1;
		byte b = a;
		a = 2;

		Point pointer1 = new Point(1, 1); // Point(x:1, y:1)
		Point pointer2 = pointer1;
		pointer1.x = 2;

		System.out.println(pointer2);


	

	}
}