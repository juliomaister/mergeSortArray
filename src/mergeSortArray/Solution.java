package mergeSortArray;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		nums1 = merge(nums1, m, nums2, n);
		int[] nums3 = {1,0};
		m = 1;
		int[] nums4 = {2};
		n = 1;
		nums3 = merge(nums3, m, nums4, n);
		sysoIntArray(nums3);
	}

	private static void sysoIntArray(int[] nums1) {
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n)  {
		if (n != 0) {
			int j = 0;
			if (nums1.length != 1) {
				for (int i = m; i <= nums1.length; i++) {
					nums1[m + j] = nums2[j];
					j++;
				}
			}else {
				nums1[0] = nums2[0];
			}
			Arrays.sort(nums1);
		}
		return nums1;
	}
	
	public static int[] mergeEfficient(int[] nums1, int m, int[] nums2, int n)  {
		 for (int j = 0, i = m; j < n; j++) {
	            nums1[i] = nums2[j];
	            i++;
	        }
		 Arrays.sort(nums1);
		 return nums1;
	}
}
