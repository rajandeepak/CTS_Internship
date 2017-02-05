import java.util.Set;
import java.util.TreeMap;

public class LetterSequence {
	
	private String sentence;
	
	
	//constructor to get the sentence as the input 
	
	public void setString(String s){
		this.sentence = s;
	}
	
	
	//Compute the frequency of each character in the sentence
	
	public TreeMap<Character,Integer> computeFrequency(){
		
		TreeMap<Character, Integer> treemap = new TreeMap<>();
		
		for(int i=0;i<sentence.length();i++){
			
			if(sentence.charAt(i)!=' '){
				
					int count = treemap.containsKey(sentence.charAt(i))?treemap.get(sentence.charAt(i)):0;
					treemap.put(sentence.charAt(i), count+1);
			}
			
		}
		return treemap;
		
		
	}
	
	
	//iterate the tree map and get all the entries and print the information in a graphical 
	
	public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap){
		Set<Character> set = frequencyMap.keySet();
		
		for(Character ch:set){
			
			String output = "";
			int counter = frequencyMap.get(ch);
			while(counter>0){
				output = output+"*";
				counter--;
			}
			
			System.out.println(ch+" : "+output);
			
		}
		
	}
}