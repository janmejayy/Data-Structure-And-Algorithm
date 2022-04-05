package Searching;

public class PeakNumberInArray {
	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,9,8,10};
int n=10;
int peak=peakElement(arr, n);
System.out.println(peak);


}
public static int peakElement(int[] arr,int n)
{
     int start = 0 ;
   int end = n-1;
   
   while(start<end){
       int mid = start+(end-start)/2;
       if(arr[mid]>arr[mid+1]){
         end = mid;
       }
       else{
           start = mid+1;
       }
   }
   return start;
}
}