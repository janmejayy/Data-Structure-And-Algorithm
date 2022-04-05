package Arrays;

import java.util.Arrays;

public class KthSmallestArray {
public static void main(String[] args) {
	int arr[]= {7,10, 4, 20, 15};
	int target=4;
	int ans=kthSmallestArray(arr,target);
	System.out.println(ans);
}

private static int kthSmallestArray(int[] arr,int target) {
	Arrays.sort(arr);
	return arr[target-1];
}
}
