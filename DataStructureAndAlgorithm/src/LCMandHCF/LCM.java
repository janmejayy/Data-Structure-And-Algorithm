package LCMandHCF;

import java.util.Scanner;

public class LCM {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int ans=lcm(a,b);
	System.out.println(ans);
	
}

 static int lcm(int a, int b) {
	int res=Math.max(a,b);
	int max=res;
 	while(true) {
 		if(max%a==0 && max%b==0)  
 			return max;
 	        max++;
 			}
 		}
 		
 	}


