import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static Integer scoreunder10= 10;
	public static Integer scoreunder20= 20;
	public static Integer scoreunder30 = 30;
	public static Integer scoreunder40  = 40;
			
	public static void main(String[] args) {

		BufferedReader br;
		Integer i,nOvers,score;
		
		Histogram hist;
		
				
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			hist = new Histogram();
			
		
			nOvers = Integer.parseInt(br.readLine());
			
			for(i=1;i<=nOvers;i++){
					score = Integer.parseInt(br.readLine());
					hist.addScore(score);
				}
				
				hist.displayHistogram();
				
				
				
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
