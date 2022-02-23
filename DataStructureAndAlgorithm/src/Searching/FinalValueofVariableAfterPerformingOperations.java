package Searching;
public class FinalValueofVariableAfterPerformingOperations {
public static void main(String[] args) {
	String []operations = {"--X","X++","X++","X++"};
	
	System.out.println(finalValueAfterOperations(operations));
	
}

    public static int finalValueAfterOperations(String[] operations) {
        
   if(operations.length == 0){
        return 0;
    }
    int x = 0;

    for(int i  = 0 ; i< operations.length; i++){
        if(operations[i].equals("--X") || operations[i].equals("X--")){
            x -= 1;
        }else if(operations[i].equals("++X") || operations[i].equals("X++")){
            x += 1;
        }

    }


    return x;

    
}
}

