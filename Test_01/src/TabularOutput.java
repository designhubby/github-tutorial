
public class TabularOutput {

	public static void printTable(){
		int n = 1;
		String space = "   ";
		System.out.println(n + space + "10*n" + space + "100*n" + space + "1000*n");
		for(int i = 1; i<12; i++){
			n = i;
			
			System.out.printf("%s%5d%s%5d%s%5d%s%5d", "\n", n,space,n*10,space, n*100,space, n*1000);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabularOutput.printTable();
		
	}

}
