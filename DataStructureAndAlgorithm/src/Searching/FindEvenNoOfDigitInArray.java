package Searching;

public class FindEvenNoOfDigitInArray {
	public static void main(String[] args) {
		int arr[]= {24,568,2967,8473,3242,653};
		int ans=findNumber(arr);
		System.out.println(ans);
		
	}

	static int findNumber(int[] arr) {
		int count=0;
		for(int num:arr) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}
   static boolean even(int num) {
	   int noOfDigit=digit(num);
		return noOfDigit % 2==0;
	}

private static int digit(int num) {
	int count =0;
	while(num>0) {
		count++;
		num=num/10;
		
	}
	return count;
}
}
