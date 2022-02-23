package Searching;

public class FindTargetCharInString {

	public static void main(String[] args) {
       String name="janmejay";
       char target='k';
       boolean bool=Search(name,target);
       System.out.println(bool);
	}
	static boolean Search(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for (int i=0; i<str.length(); i++) {
			if(target==str.charAt(i));
			return true;
		}
	
	return false;

}
}