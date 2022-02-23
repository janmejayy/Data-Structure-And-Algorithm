package Searching;
import java.lang.*;
import java.util.Arrays;

public class SearchTargetIn2dArray {
	public static void main(String[] args) {
		int[][] arr= {{32,34,45,443},
				      {233,54,23},
		              {432,53,25,25}};
		int target=233;
		int [] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
		}
	static int[] search(int[][] arr,int target) {
		for(int row=0; row<arr.length; row++) {
			for (int col=0; col<arr[row].length; col++) {
				if(arr[row][col]==target) {
					return new int []{row,col};
			}
		}
	} return new int [] {-1,-1};
	}
}

