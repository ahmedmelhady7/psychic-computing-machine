import java.util.Arrays;
import java.util.Scanner;

public class PriyankaToys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			weights[i] = sc.nextInt();
		}
		Arrays.sort(weights);
		int unitsCount = 1;
		int j = 1;
//		int i=0, ans=1;
//	    for(int j=1; j < weights.length; j++) {
//	        while(weights[i] + 4 >= weights[j]) j++;
//	        i=j;
//	        if(i < weights.length) ans++;
//	    }
		for (int i = 0; i < weights.length; i++) {
			while (weights[i] <= (weights[j] + 4))
				i++;
			j = i;
			if (j < weights.length)
				unitsCount++;
		}
		System.out.println(unitsCount);
		sc.close();
	}
}
