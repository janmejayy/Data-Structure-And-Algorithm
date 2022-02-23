package sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class FindAllNumbersDisappeareInArray {

public List <Integer> findDisappeareNumber (int [] arr) {
	int i=0;
	while(i<arr.length) {
		int correct=arr[i]-1;
		if (arr[i] !=arr[correct]) {
			//swap
			int temp=arr[i];
			arr[i]=arr[correct];
			arr[correct]=temp;
			
		}else {
			i++;
		}
	}
	List <Integer> ans=new ArrayList<>();
	for(int index=0; index<arr.length; index++) {
		if (arr[index]!=index+1) {
			ans.add(index+1);
		}
	}return ans;
}
	

}
