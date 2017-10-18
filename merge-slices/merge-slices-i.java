// Time taken: 25 minutes to write and test, of which 10 were looking at documentation

package clojurevs;

import java.util.Arrays;

public class MergeSlices {

	private static int[] makeMergedSlices() {
		int[] nums = {1, 2, 3, 4, 5};
		int[] first = Arrays.copyOfRange(nums, 0, 2);
		int[] second = Arrays.copyOfRange(nums, 3, nums.length);
		int[] merged = new int[first.length + second.length];
		int i = 0, offset = first.length;
		for (i = 0; i < offset; i++) merged[i] = first[i];
		for (i = 0; i < second.length; i++) merged[offset + i] = seconds[i];
		
		return merged;
	}

	public static void main(String[] args) { // not C Style, GOK why
		int[] ms = makeMergedSlices();
		for (int i = 0; i < ms.length; i++) {
			System.out.print(String.valueOf(merged[i]));
			if (i < merged.length -1) System.out.print(' ');
		}
	}
}

