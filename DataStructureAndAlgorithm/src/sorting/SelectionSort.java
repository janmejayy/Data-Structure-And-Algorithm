package sorting;

import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		int [] arr= {2,4,3,8,6,9,-10};
		selection(arr);
        System.out.println(Arrays.toString(arr));
	}
	 static void selection(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            // find the max item in the remaining array and swap with correct index
	            int last = arr.length - i - 1;
				int maxIndex = getMaxIndex(arr, 0, last);
	            swap(arr, maxIndex, last);
	        }
	    }

		static void swap(int[] arr, int maxIndex, int last) {
	        int temp = arr[maxIndex];
	        arr[maxIndex] = arr[last];
	        arr[last] = temp;
	    }

	    static int getMaxIndex(int[] arr, int start, int last) {
	        int max = start;
	        for (int i = start; i <= last; i++) {
	            if (arr[max] < arr[i]) {
	                max = i;
	            }
	        }
	        return max;
	    }


}
