import java.util.Scanner;
import java.util.TreeMap;

class Main{
	
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the input string");
		
		String str = input.nextLine();
		
		LetterSequence seq = new LetterSequence();
		
		seq.setString(str);
		
		TreeMap<Character, Integer> treemap = seq.computeFrequency();
		
		seq.displayLetterFrequency(treemap);
		
		input.close();
	}
}



