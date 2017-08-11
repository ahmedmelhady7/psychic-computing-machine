
public class AwesomeNumberProblem {

	public static void main(String[] args) {
//		System.out.println(isAwesome2(94));
		int[] a = {1,2,3};
		System.out.println(a[0]);
	}

	private static boolean isAwesome(int number) {
		int sum;
		for (int i = 1; i <= (number / 2); i++) {
			sum = 0;
			for (int j = i; j <= (number / 2) + 1; j++) {
				sum += j;
				System.out.println("adding " + j + " to sum to be " + sum);
				if (sum == number)
					return true;
				else if (sum > number)
					break;
			}
		}
		return false;
	}

	private static boolean isAwesome2(int number) {
		int startingPoint = 1, nextAdd = 1;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (sum < number) {
				sum += nextAdd;
				System.out.println("adding " + nextAdd + " to sum to be " + sum);
				nextAdd++;
			} else {
				sum -= startingPoint;
				System.out.println("subtracting " + startingPoint + " from sum to be " + sum);
				startingPoint++;
			}
			if (sum == number)
				return true;

		}
		return false;
	}

}
