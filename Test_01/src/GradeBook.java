import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GradeBook {
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	private int[] grades;
	
	
	
	
	/*public GradeBook(){
	
	}*/
	
	public void getAllGrades(){
		//Using Set with Map and casted by Map.Entry on Iterator
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is: "+mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
			
		}
		//using Set with Map Generic and casted by Entry on iterator
		Set set2 = hmap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> mentry2 = (Entry<String, Integer>) it.next();
			System.out.println("\n Second MapEntry Results: " + mentry2.getValue() + " " + mentry2.getValue());
		}
		//using for advance loop on Map.Entry across hashmap entrySet
		//Also added Average Grade
		int gradetotal =0;
		int n = 0;
		double gradeavg;
		for (Map.Entry<String, Integer> mapentryofgrades : hmap.entrySet()){
			
			n++;
			
			gradetotal += mapentryofgrades.getValue();
			
			System.out.println("Grade Key: " + mapentryofgrades.getKey() + " Grade Value: " + mapentryofgrades.getValue());
		};
		gradeavg = (double) ((double)gradetotal / (double)n);
		System.out.println("\n Grade Average = " + gradeavg + " Total Grades: " + n);
		
		
		


		
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
