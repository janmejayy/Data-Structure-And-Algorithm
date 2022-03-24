import java.util.Scanner;

public class TaxCal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for (int i=0; i<a;i++) {
		int j=sc.nextInt();
		if (j<=1000) {
			System.out.println("0");
		}
		else if (j>1000) {
			int k=(int) (j*0.1);
			System.out.println(k);
		}else if(j>100000) {
			int l=(int) (j*0.20);
			System.out.println(l);
		}
		else if (j>1000000)
		{
			int m=(int)(j*0.25);
			System.out.println(m);
		}
		
	}
	

}}
