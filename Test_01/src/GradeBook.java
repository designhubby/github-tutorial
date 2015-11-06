import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBook {
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	private int[] grades;
	
	
	
	
	/*public GradeBook(){
	
	}*/
	
	public void getAllGrades(){
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is: "+mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
			
		}
		/*
		int i_length = grades.length;
		
		
		for(int i = 1; i< i_length;i++){
			
		}*/
	}
	
	public void setGrade(){
		
		Scanner input = new Scanner(System.in);
		String name = "";
		int grade;
		while(true){
			System.out.println("\nPlease enter Name: ");
			name= input.next();
			if(name.equals("-1")){
				break;
			}
			System.out.println("\nYou entered" + name);
			System.out.println("\nPlease enter grade: ");
			grade = input.nextInt();
			hmap.put(name,grade);
		}
		grades = new int[10];
		
	}
	
	public void calcGradeAvg(){
		
	}
	
	public void displayGrade(){
		
	}
}
