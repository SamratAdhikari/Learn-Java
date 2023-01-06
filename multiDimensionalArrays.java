import java.util.Arrays;

public class multiDimensionalArrays{
	public static void main(String[] args){
		// 2D arrays
		int[][] numbers1 = new int[2][3];
		numbers1[0][0] = 1;
		System.out.println("2D arrays, items are unknown: " + Arrays.deepToString(numbers1));

		int[][] numbers2 = { {1, 2, 3}, {4, 5, 6} };
		System.out.println("2D arrays, items are known: " + Arrays.deepToString(numbers2));

		// 3D arrays
		int[][][] numbers3 = new int[3][3][3];
		numbers3[1][1][1] = 1;
		System.out.println("3D arrays, items are unknown: " + Arrays.deepToString(numbers3));

	}
};