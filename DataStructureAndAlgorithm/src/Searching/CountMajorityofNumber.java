package Searching;

public class CountMajorityofNumber {
public static void main(String[] args) {
int a[] = {3,1,3,3,2,4} ;
int size=5;
int ans=majorityElement(a,size);
System.out.println(ans);

	}
	static int majorityElement(int a[], int n)
	   {
	      
	       int element=a[0];
	       int count=1;
//	       for(int i=1;i<n;i++){
//	           if(element==a[i]){
//	               count++;
//	           }
//	           else{
//	               count--;
//	           }
//	           if(count==0){
//	              element=a[i];
//	               count=1;
//	           }
//	       }
//	       count=0;
	       for(int i=0;i<n;i++){
	           if(element==a[i]){
	               count++;
	           }
	       }
	       if(count<=n/2){
	           element=-1;
	       }
	       return element;
	       
	   }
	}