package GuviTask9;

import java.util.Scanner;

public class GradingSystem {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Marks");
	int marks = sc.nextInt();
	String grade = CalculateGrade(marks);
	System.out.println("Grade :" + grade);
	
}

private static String CalculateGrade(int marks) {
	if (marks > 100 || marks <0) {
		return "Invalid Input";
		
	}else if (marks >= 90 && marks <=100) {
		return "S";
		
	}else if (marks >=80 && marks <=89 ) {
		return "A";
	}else if (marks >=70 && marks <=79) {
		return "B";
		
	}else if (marks >=60 && marks <=69) {
		return "C";
		
	}else if (marks >=50 && marks <=59) {
		return "D";
		
	}else {
		return "F";
	}
	
		
	
	
}
}
