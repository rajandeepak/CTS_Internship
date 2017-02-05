import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
//code in git repo.
public class Main {

	

    private static void addToList(ArrayList<Integer> List){
    	//code 
    	 ArrayList <Integer> newList = new ArrayList<>();
        double sum = 0.0;
         int n = List.size();
         for (int i = 0; i < n; i++){
             sum += newList.get(i);
         }
         System.out.println((int) sum);
	    System.out.println(( sum) / n);
           
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		Scanner sc = new Scanner(System.in);
		 int numOfMatches,runsScored;
		 
		 numOfMatches = sc.nextInt();
		 sc.nextLine();
		
		 ArrayList <Integer>list = new ArrayList<Integer>(numOfMatches);
		
		 for(int i=0;i<numOfMatches;i++){
			 runsScored = sc.nextInt();
			 list.add(runsScored);
			 
		 }
		 addToList(list);
		
	}

}
