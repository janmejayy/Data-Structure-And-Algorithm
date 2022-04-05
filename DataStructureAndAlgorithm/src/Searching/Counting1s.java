package Searching;

public class Counting1s {
public static void main(String[] args) {
	int arr[] = {1,1,1,1,1,0,0,0};
	int N=arr.length;
	int ans=countOnes(arr, N);
	System.out.println(ans);
}

static int countOnes(int arr[], int N)
{
    int lo=0,hi=N-1,mid;
    
    while(lo <= hi){
        
        mid = (hi+lo)/2;
        
        if(arr[mid] == 0){
            hi=hi-1;
        }
        else
            lo=mid+1;
    }
    return lo;
}}