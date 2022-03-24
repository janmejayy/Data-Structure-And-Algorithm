package Arrays;

public class FindMaxMinInArray {
public static void main(String[] args) {
	int arr[]= {12,48,2,3,4,9,98,323};
	int ans1=maxNumber(arr);
	int ans2=minNumber(arr);
	
	System.out.println("Max ="+ans1+" "+"Min ="+ans2);
}

private static int maxNumber(int[] arr) {
	int max=0;
	for (int i=0; i<=arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}

private static int minNumber(int[] arr) {
	int min=arr[0];
	for (int i=0; i<=arr.length-1;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}}