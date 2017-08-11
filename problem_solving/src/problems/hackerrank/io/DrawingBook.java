package problems.hackerrank.io;

import java.util.*;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		// your code goes here
		System.out.print(findSteps(n, p));
		in.close();
	}

	private static int findSteps(int n, int p) {
		// System.out.println("n is "+n+" p is "+p);
		if (p == n || p == 1 || (p == (n - 1) && (n % 2 == 1)))
			return 0;
		else if ((p - 1) > (n - p))
			return 1 + (n - p) / 2;
		else if ((p - 1) <= (n - p))
			return (p - 1) > 1 ? (p - 1) / 2 : (p - 1);
		return 0;
	}
}
