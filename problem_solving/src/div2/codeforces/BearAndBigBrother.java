package div2.codeforces;

import java.util.Scanner;

/**
 * http://codeforces.com/contest/791/problem/A
 * @author hadi
 * 
 */

public class BearAndBigBrother {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int result = 0;
		while(v<=e) {
			v*=3;
			e*=2;
			result++;
		}
		sc.close();
		System.out.println(result);
	}
}
