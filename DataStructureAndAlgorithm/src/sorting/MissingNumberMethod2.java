package sorting;

public class MissingNumberMethod2 {
public static void main(String[] args) {
	int[] nums= {1,4,2,3,0,5,7};
    System.out.println(missingNumber(nums));
}

public static int missingNumber(int[] nums) {
    int sum=0;
      int len=nums.length+1;
       for(int n:nums)
       sum+=n;
      return ((len*(len-1)) /2-sum); //formula to find missing number
        
    }

}
