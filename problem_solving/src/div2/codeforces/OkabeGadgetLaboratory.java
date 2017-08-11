package div2.codeforces;

import java.util.Scanner;

public class OkabeGadgetLaboratory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean allGood = true, breakOut = false;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 1) {
					allGood &= isGoodNumber(a, i, j);
				}
			}
		}
		sc.close();
	}

	private static boolean isGoodNumber(int[][] a, int k, int l) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
			}
		}

		return false;
	}
}
