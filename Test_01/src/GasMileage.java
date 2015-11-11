import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//try arraylist later

public class GasMileage {

	
	HashMap<Integer, Integer> disgas = new HashMap<Integer, Integer>();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GasMileage gm = new GasMileage();
		gm.inputValues();
		gm.outputValues();
	}
	//input trip distance and fuel usage
	private void inputValues(){
		
		Scanner input = new Scanner(System.in);
		Integer distance;
		Integer fuelusage;
		while(true){
			System.out.println("\n Please input the Distance or -1 to end:  ");
			distance = input.nextInt();
			if(distance.equals(-1)){
				System.out.println("input done");
				break;
			}
			System.out.println("\n Please input the fuel usage: ");
			fuelusage = input.nextInt();
			disgas.put(distance, fuelusage);
			
			
			//System.out.println(" Distance = " + distance);
			
			
		}
		input.close();
		
		

		
		
	}
	//Display the results including trip distance, fuel usage and usagerate and average across all trips
	private void outputValues(){
		
		Double totalavg;
		Integer i;
		totalavg = (double) 0;
		for(Map.Entry<Integer, Integer> currentEntry : disgas.entrySet()){
			totalavg += (double) currentEntry.getKey()/currentEntry.getValue();
			System.out.println("\n Trip Distance: " + currentEntry.getKey() + " Trip Fuel Usage: " + currentEntry.getValue());
			
		}
		i = disgas.size();
		System.out.println("\n Average Gas Consumption Rate: " + totalavg/i);
	}

}
