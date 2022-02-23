package sorting;

import java.util.Arrays;

public class SelectionSortM2 {
	public static void main(String[] args) {
		int [] arr= {2,4,3,8,6,9,-10};
		selection(arr);
        System.out.println(Arrays.toString(arr));
	}

	 static void selection(int[] arr) {
    for (int i=0; i<arr.length-1; i++) {
	int smallest =i;
	for(int j=i+1; j<arr.length; j++) {
		if (arr[smallest]>arr[j]) {
			smallest =j;
		}
	}
	int temp=arr[smallest];
	arr[smallest]=arr[i];
	arr[i]=temp;
}
	}

}
