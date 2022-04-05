package Searching;

public class binarySearch {
	public static void main(String[] args) {
		int arr[]= {23,43,54,64,67,86,91,103,107,22,39,-1,57};
		int target=91;
		int ans=binaryFunction(arr,target);
		System.out.println(ans);
	}

    static int binaryFunction(int[] arr, int target) {
    	int start=0;
    	int end=arr.length-1;
    	int mid=start+(end-start)/2;
    	while(start<=end) {
    	
  
    	if (target<arr[mid]) {
    		end=mid-1;
    	}
    	else if(target>arr[mid]) {
    		start=mid+1;
    	}
    	else {
    		return mid;
    	}
    }
    return -1;
	} 
}

