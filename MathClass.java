public class MathClass{
	public static void main(String[] args){
		// round
		int i = Math.round(1.5F);
		System.out.println(i);

		// ceil
		int j = (int)Math.ceil(9.1F);
		System.out.println(j);
		
		// floor
		int k = (int)Math.floor(9.9F);
		System.out.println(k);

		// max
		int l = Math.max(2, 6);
		System.out.println(l);

		// min
		int m = Math.min(1, -1);
		System.out.println(m);

		// Random value between (0, 1)
		double n = Math.random();
		System.out.println(n);

		// Random value between (0, 10)
		int o = (int)( Math.random() * 10 );
		System.out.println(o);

		// Random value between (0, 3]
		int p = (int)( (Math.random()*10) % 3 + 1 );
		System.out.println(p);



	}
};