package problems.general;

import java.util.Scanner;

public class FunnyBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
		sc.close();
	}

	public static int solution(String s) {
		int size = s.length();
		int[] leftOccurences = new int[size];
		int[] rightOccurences = new int[size];
		int start = 0, end = size - 1, leftCounter = 0, rightCounter = 0;
		while (end >= 0) {
			if (s.charAt(start) == '(')
				leftCounter++;
			if (s.charAt(start) == ')')
				rightCounter++;
			if (leftCounter == rightCounter) {
				return (start + 1);
			}
			leftOccurences[start] = leftCounter;
			rightOccurences[end] = rightCounter;
			start++;
			end--;
		}
		return 0;
	}
}
