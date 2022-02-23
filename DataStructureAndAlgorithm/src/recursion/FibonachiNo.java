package recursion;

public class FibonachiNo {
public static void main(String[] args) {
	long ans=fibo(4);
	System.out.println(ans);
}
static long fibo(long n) {
	//base codition
	if(n<2) {
		return n;
	}
	long fibo=fibo(n-1)+fibo(n-2);
	return  fibo;
}
}
