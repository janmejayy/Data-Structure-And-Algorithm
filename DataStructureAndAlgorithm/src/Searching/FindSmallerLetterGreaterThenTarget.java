package Searching;

public class FindSmallerLetterGreaterThenTarget {
	public static void main(String[] args) {
		char[] letter={'c','f','j'};
		char target='d';
		char ans=ceilingFunction(letter,target);
		System.out.println(ans);
		
	}
	static char ceilingFunction(char[] letter, char target) {	
		int start=0;
		int end=letter.length-1;
			while(start<=end) {
			int mid=start+(end-start)/2;
			if (target<letter[mid]) {
				end=mid-1;	
			}
			else {
			start=mid+1;
			}
		} return letter[start%letter.length];
			
		}
	}

