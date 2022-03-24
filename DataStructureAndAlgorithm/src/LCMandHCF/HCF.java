package LCMandHCF;

import java.util.Scanner;

public class HCF {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int ans=hcf(a,b);
	System.out.println(ans);
}

 static int hcf(int a, int b) {
	int res=Math.min(a, b);
	while(res>0) {
		if(a%res==0 &&b%res==0) {
			break;
		}res--;
		
	}
	return res;
}
}
