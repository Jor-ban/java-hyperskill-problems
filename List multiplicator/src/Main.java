// IT WORKS ABSOLUTELY WELL LOCALLY!

import java.util.ArrayList;
import java.util.List;

/**
    Class to modify
*/
class ListMultiplicator {

    /**
        Repeats original list content provided number of times   
        @param list list to repeat
        @param n times to repeat, should be zero or greater
    */
	public static<T> void multiply(List<T> list, int n) {
		int length = list.size();
		if (n == 0) {
			list.clear();
		}
		for (int i = 1; i < n; i++) {
			for (int index = 0; index < length; index++) {
				list.add(list.get(index));
			}
		}
	}
}
//class Main {
//	public static void main(String[] args) {
//		var list = new ArrayList<String>();
//		list.add("Hello");
//		list.add("world");
//		list.add("!");
//		ListMultiplicator.multiply(list, 2);
//		System.out.println(list);
//	}
//}