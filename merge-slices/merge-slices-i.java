// Time taken: 25 minutes to write and test, of which 10 were looking at documentation

package clojurevs;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MergeSlices {

	private static int[] makeMergedSlices() {
		int[] nums = {1, 2, 3, 4, 5};
		int[] first = Arrays.copyOfRange(nums, 0, 2);
		int[] second = Arrays.copyOfRange(nums, 3, nums.length);
		int[] merged = new int[first.length + second.length];
		int i = 0, offset = first.length;
		for (i = 0; i < offset; i++) merged[i] = first[i];
		for (i = 0; i < second.length; i++) merged[offset + i] = second[i];
		
		return merged;
	}
	
	public static List<Integer> makeMergedLists() { 
		/* contributed by sighphyre; 
		 * 15 mins to remember how to get Java to compile without an IDE, 5 minutes to write the code
		 */
		 List<Integer> nums = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
		List<Integer> firstSet = new ArrayList<Integer>(nums.subList(0, 2));
        	firstSet.addAll(nums.subList(3, nums.size()));
		
		return firstSet;
	}

	public static void main(String[] args) { // not C Style, GOK why
		int[] ms = makeMergedSlices();
		for (int i = 0; i < ms.length; i++) {
			System.out.print(String.valueOf(merged[i]));
			if (i < merged.length -1) System.out.print(' ');
		}
	}
}

