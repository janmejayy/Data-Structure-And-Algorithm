package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr= {5,1,2,34,3,4,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}	
		
		static void bubbleSort(int [] arr) {
		for (int i=0; i<arr.length-1; i++ ) {
			for (int j=0; j<arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {//for ascending use <
					int temp =arr[j];
					 arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				
			}
		}
	}

}
