import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int len = sc.nextInt();
			int[] a = new int[len], b = new int[len];
			int k = sc.nextInt();
			for (int j = 0; j < len; j++) {
				a[j] = sc.nextInt();
			}
			for (int l = 0; l < len; l++) {
				b[l] = sc.nextInt();
			}
			if (CanBePermuted(a, b, k))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length-1-i] = a[i];
        }
        return b;
    }
	
	private static boolean CanBePermuted(int[] a, int[] b, int k) {
		Arrays.sort(b);
		b = reverse(b);
		Arrays.sort(a);
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
				if (a[i] + b[i] < k) {					
					flag = false;
					break;
				}
		}
		
		return flag;
	}
}
