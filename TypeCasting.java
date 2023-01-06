public class TypeCasting{
	public static void main(String[] args){
		// Implicit casting
		// byte > short > int > long > float > double
		int x = 1;
		double y = x + 5;
		System.out.println(y);

		// Explicit casting
		double a = 1;
		int b = (int)a + 5;
		System.out.println(b);

		// String to int
		// Integer.parseInt(arg)
		// Float.parseFloat(arg)
		String i = "1";
		int j = Integer.parseInt(i) + 5;
		System.out.println(j);
	}
};