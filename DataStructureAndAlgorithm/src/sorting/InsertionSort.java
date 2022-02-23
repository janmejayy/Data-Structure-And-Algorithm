package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr= {6,3,7,4,9,1,0};
		insertionsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	 static void insertionsort(int[] arr) {
        for(int i=0; i<arr.length;i++) {
        	int temp=arr[i];
        	int j=i;
        	while(j>0 && arr[j-1]>temp) 
        	{   
        		arr[j]=arr[j-1];
        		j=j-1;
        		}
        	arr[j]=temp;
        }
	}

}
