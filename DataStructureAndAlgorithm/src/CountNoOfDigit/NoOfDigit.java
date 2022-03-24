package CountNoOfDigit;

public class NoOfDigit {
public static void main(String[] args) {
	int a=1056620;
	int count=0;
	while(a>0) {
		a=a/10;
		count++;
	}System.out.println(count);
}
}
