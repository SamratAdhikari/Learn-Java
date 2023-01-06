public class Strings{

	public static void main(String args[]){
		// Strings are reference types
		String msg = " Hello World ";

		// methods used in Strings
		boolean endTest = msg.endsWith("World"); // check if the string ends with 'World'
		boolean startTest = msg.startsWith("H"); // check if the string starts with 'H' 
		int length = msg.length(); // returns the length of the string
		int index = msg.indexOf("e"); // returns the index of first 'e' in the string
		int falseIndex = msg.indexOf("xyz"); // returns '-1' when the word is absent
		String replacedString = msg.replace("Hello", "Bye"); // replace(target: "sth", replacement: "sth");
		String upperString = msg.toUpperCase(); // converts all letters to upper case
		String lowerString = msg.toLowerCase(); // converts all letters to lower case
		String trimmedString = msg.trim(); // removes all extra whitespaces

		System.out.println(msg + " what you doing?"); // concatinating

		System.out.println(endTest);
		System.out.println(startTest);
		System.out.println(length);
		System.out.println(index);
		System.out.println(falseIndex);
		System.out.println(replacedString);
		System.out.println(upperString);
		System.out.println(lowerString);
		System.out.println(trimmedString);
	}
}