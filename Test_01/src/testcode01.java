
public class testcode01 {

	public static String key1 = "I am key";
	public static int value = 5;
	public static NotGeneric ngtest = new NotGeneric(key1, value);
	public static IsGeneric<String, Integer> gtest = new IsGeneric<>(key1,value);
	public static SingleGeneric<Integer> sgtest = new SingleGeneric<>(new Integer(3));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test 
		System.out.println(1<2? "true": "false");
		int i = 0;
		while(i<10){
			System.out.print(i);
			i++;
		}
		
		Integer int1 = (Integer) ngtest.getValue();
		System.out.println("\nfsafs" + int1);
		String int2 = (String)gtest.getKey();
		System.out.println(int2);
		Integer int3 = sgtest.getSingleGeneric();
		System.out.println(int3);
		
	}

}
