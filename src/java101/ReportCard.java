package java101;
import java.util.Scanner;
public class ReportCard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student name:" );
		String name =sc.nextLine();
		System.out.print("Enter roll number:");
		int rollNumber= sc.nextInt();
		System.out.print("Enter garde:");
		char grade = sc.next().charAt(0);
		System.out.print("Enter subject 1 marks:");
		int subject1 = sc.nextInt();
		
	System.out.print("Enter subject 2 marks:");
	int subject2= sc.nextInt();
	System.out.print("Enter subject 3 mark");
	int subject3 = sc.nextInt();
	  int total = subject1 + subject2 + subject3; 
	  double average = total/3.0;
	  boolean passed = average>=40;
	  
	  System.out.println("\n---Student Report Card----");
	  System.out.println("Name: "+name);
	  System.out.println("Roll number:" + rollNumber);
	  System.out.println("Grade:" + grade);
	  System.out.println("Subject1:" + subject1);
	  System.out.println("Subject2:" + subject2);
	  System.out.println("Subject3:" + subject3);
	  System.out.println("Total Marks:"  + total);
	  System.out.println("Average:" + average);
	  System.out.println("Passed:" + passed);
	  

	
		
		
	}
}

