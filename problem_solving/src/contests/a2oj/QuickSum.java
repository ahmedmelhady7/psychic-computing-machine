package contests.a2oj;

import java.util.Scanner;

public class QuickSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		String s = "";
		do {
			result = 0;
			s = sc.nextLine();
			if(!s.equals("#")) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) != ' ') {
						result += (i + 1) * (s.charAt(i) - 64);
						// System.out.println((i + 1) + "*" + (s.charAt(i) -
						// 64));
					}
				}
				System.out.println(result);
			}
		} while (!s.equals("#"));
		sc.close();
	}
}
