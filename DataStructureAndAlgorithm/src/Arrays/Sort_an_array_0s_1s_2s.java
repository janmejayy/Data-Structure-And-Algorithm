package Arrays;

import java.util.Arrays;

public class Sort_an_array_0s_1s_2s {
	public static void main(String[] args) {
		int arr[]= {0,2,1, 2, 0};
		
		kthSmallestArray(arr);
	}

	private static void kthSmallestArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	}
