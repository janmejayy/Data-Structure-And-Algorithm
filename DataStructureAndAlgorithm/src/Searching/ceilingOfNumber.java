package Searching;

public class ceilingOfNumber {

	public static void main(String[] args) {
		int[] arr= {54,44,42,40,35,30,26,22,10};
		int target=35;
		int ans=ceilingFunction(arr,target);
		System.out.println(ans);
 	}

	 static int ceilingFunction(int[] arr, int target) {
//		if (target>arr[arr.length-1]) {
//			return -1;
//			}
		int start=0;
		int end=arr.length-1;
			while(start<=end) {
			int mid=start+(end-start)/2;
			if (target>arr[mid]) {
				end=mid-1;	
			}
			else if(target<arr[mid]) {
			start=mid+1;
			}else {
				return mid;
			}	
		}return start;
	}

}