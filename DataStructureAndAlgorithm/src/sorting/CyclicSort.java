package sorting;

import java.util.Arrays;

public class CyclicSort {
public static void main(String[] args) {
	int [] arr= {5,4,3,2,6,1};
	cyclicsort(arr);
    System.out.println(Arrays.toString(arr));
}

 static void cyclicsort(int[] arr) {
int i=0;
while(i<arr.length) {
	int correct=arr[i]-1;
	if (arr[i] !=arr[correct]) {
		//swap
		int temp=arr[i];
		arr[i]=arr[correct];
		arr[correct]=temp;
		
	}else {
		i++;
	}
}

}

}
