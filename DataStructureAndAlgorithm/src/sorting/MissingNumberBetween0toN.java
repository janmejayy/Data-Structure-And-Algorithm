package sorting;

public class MissingNumberBetween0toN {

	public static void main(String[] args) {
		int[] arr= {6,1,2,8,3,4,7,10,5};
         
         System.out.println(missingNumber(arr));
	}

	static int missingNumber(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correct]) {
				//swap
				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}else {
				i++;
			}
		}for (int index=0; index<arr.length; index++) {
			if(arr[index]!=index) {
				return index;
			}
		}return arr.length;
	}

}
