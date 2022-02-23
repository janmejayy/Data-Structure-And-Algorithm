package Searching;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		int [] number= {342,42,42,2,244,242,4,2};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target Number:");
		int target=sc.nextInt();
		int ans=linearSearch(number,target);
		System.out.println(ans);
		
	}
	static int linearSearch(int[] arr,int target) {
		if(arr.length==0) {
         System.out.println("Array is empty");
         return Integer.MAX_VALUE;
         
		}
		for(int index=0; index<arr.length; index++) {
		int element =arr[index]	;
		if (element==target) {
			return index;
			
			
		}
		}
		//this line will be executed if none of statement executed
		//hence target not found
	   return -1;
	}
	
}
