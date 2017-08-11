import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenTree {

	public static Map<Integer, ArrayList<Integer>> tree;
	public static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		tree = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			tree.put(i, new ArrayList<>());
		}

		for (int i = 0; i < e; i++) {
			int child = sc.nextInt();
			int parent = sc.nextInt();
			tree.get(parent).add(child);
		}
		for (int i = 2; i < tree.size(); i++) {
			if (countChild(i) % 2 != 0)
				count++;
		}
		sc.close();
		System.out.println(count);
	}

	public static int countChild(int node) {
		int total = tree.get(node).size();
		for (int child : tree.get(node)) {
			total += countChild(child);
		}
		return total;
	}
}
