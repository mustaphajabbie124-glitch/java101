package java101;
import java.util.Scanner;
public class StudentGradeCalculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of student");
	int numberOfStudents = input.nextInt();
	input.nextLine();
	for (int i = 1; i <= numberOfStudents; i++) {
		System.out.println("\n---Student" + i +"---");
	System.out.print("Enter student name:");
	String name = input.nextLine();
	System.out.print("Enter grade 1:");
	double grade1 = input.nextDouble();
	System.out.print("Enter grade 2:");
	double grade2 = input.nextDouble();
	System.out.print("Enter gade 3 : ");
	double grade3 = input.nextDouble();
	 double average = (grade1 + grade2 + grade3 ) / 3;
	 System.out.printf("Student: %s | avrage Grade: %.2f%n", name, average);
	 input.nextLine();
		
	}
	input.close();
	
}
}
