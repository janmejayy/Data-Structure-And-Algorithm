package Searching;

public class FindMaxValueInArray {

	public static void main(String[] args) {
		int []arr= {23,24344,56,57,57,7,57,874,3};
		System.out.println(max(arr));
	}
	static int max(int []arr) {
		int ans=arr[0];
		for (int i=1; i<arr.length; i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}return ans;
	}

}
