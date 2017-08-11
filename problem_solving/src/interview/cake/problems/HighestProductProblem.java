package interview.cake.problems;

public class HighestProductProblem {

	public static void main(String[] args) {
		int[] array = { -10, -3, 10, 9, 8 };
		System.out.println(getHighestProduct(array));
	}

	private static int getHighestProduct(int[] array) {
		// TODO Auto-generated method stub
		int[] negativeNumber = new int[array.length];
		int negativeNumberCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0)
				negativeNumberCount++;
		}
		return 0;
	}

}
