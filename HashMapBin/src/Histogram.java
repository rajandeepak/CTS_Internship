import java.util.HashMap;

public class Histogram {

	private HashMap<Integer,Integer> bins;
	
	public  void addScore(Integer score){

		if(score >= 1 && score <= 10)
			bins.put(Main.scoreunder10 , bins.get(Main.scoreunder10 )+1);
		else if(score >10 && score <= 20)
			bins.put(Main.scoreunder20 , bins.get(Main.scoreunder20 )+1);
		else if(score >20 && score <= 30)
			bins.put(Main.scoreunder30 , bins.get(Main.scoreunder30 )+1);
		else{
			bins.put(Main.scoreunder40 , bins.get(Main.scoreunder40 )+1);
	
		}
	}
	
	
	
	public Histogram() {
		super();
		bins = new HashMap<Integer,Integer>();
		bins.put(Main.scoreunder10 , 0);
		bins.put(Main.scoreunder20 , 0);
		bins.put(Main.scoreunder30 , 0);
		bins.put(Main.scoreunder40 , 0);
		
	}
	
	
	
	public  void displayHistogram(){
		
		System.out.println("Histogram");
		System.out.print(Main.scoreunder10 +" : ");
		printStars(bins.get(Main.scoreunder10 ));
		
		System.out.print(Main.scoreunder20 +" : ");
		printStars(bins.get(Main.scoreunder20 ));
		
		System.out.print(Main.scoreunder30+" : ");
		printStars(bins.get(Main.scoreunder30 ));
		
		System.out.print(Main.scoreunder40 +" : ");
		printStars(bins.get(Main.scoreunder40));
		
	}
	public void printStars(Integer k){
		Integer i;
		for(i = 1;i<= k;i++){
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
