package contests.a2oj;

import java.util.Scanner;

/**
 * https://icpcarchive.ecs.baylor.edu/index.php?option=onlinejudge&page=show_problem&problem=937
 * 
 * @author hadi
 *
 */
public class PrisonRearrangement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), result = 0;
		for (int i = 0; i < n; i++) {
			int prisonersCount = sc.nextInt();
			int badPairs = sc.nextInt();
			if (badPairs == 0) {
				result = (int) prisonersCount / 2;
			} else if (badPairs == prisonersCount) {
				result = 0;
			} else {
				for (int j = 0; j < badPairs; j++) {
					
				}
			}
		}
	}
}
