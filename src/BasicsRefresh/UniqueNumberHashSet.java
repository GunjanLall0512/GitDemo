package BasicsRefresh;

import java.util.HashSet;

public class UniqueNumberHashSet {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 3, 5, 5 };

		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> dup = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			if(!hs1.add(a[i])) {
				dup.add(a[i]);
			}

		}
		System.out.println(hs1);
		System.out.println(dup);
	}

}
