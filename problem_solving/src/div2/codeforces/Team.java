package div2.codeforces;

import java.util.Scanner;

/**
 * http://codeforces.com/contest/231/problem/A
 * 
 * @author hadi
 * 
 */

public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), result = 0;
		for (int i = 0; i < n; i++) {
			int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
			if ((first + second + third) >= 2)
				result++;
		}
		sc.close();
		System.out.println(result);
	}
}
