
public class TableSqrCube {

	
	public TableSqrCube(){
		
	}
	
	public void getTableSqrCube(){
		System.out.printf("%8s %8s %8s","Number" , "Square" , "Cube\n");
		
		for(int i = 1; i <11; i++){
			
			for(int j =1;j<4;j++){
				
				System.out.printf("%8d",(int) Math.pow(i, j));
			}
			
			System.out.println(" ");
		}
	}
}
