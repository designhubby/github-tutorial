
public class TriangleExistence {
	static int a =4;
	static int b = 5;
	static int c=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(testMagitude()){
			System.out.println("Triangle Exists.");
		}else{
			System.out.println("Triangle doesn't exist.");
		}
	}
	public static boolean testMagitude(){
		if (a+b<c){
			return false;
		}
		if (a+c<b){
			return false;
		}
		
		if(b+c<a){
			return false;
		}
		return true;
	}
}
