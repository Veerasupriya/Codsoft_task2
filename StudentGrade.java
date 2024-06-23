import java.util.Scanner;
public class StudentGrade 
{
 public static void main(String[] args) 
 {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of subjects: ");
  int NumberOfSubjects = scanner.nextInt();
  int[] marks = new int[NumberOfSubjects];
  System.out.println("Enter the marks obtained in each subject out of 100:");
  for (int i = 0; i < NumberOfSubjects; i++) 
  {
   System.out.print("Marks in subject " + (i + 1) + ": ");
   marks[i] = scanner.nextInt();
  }
  int TotalMarks = 0;
  for (int mark : marks) 
  {
   TotalMarks += mark;
  }
  double AvgPercentage = (double) TotalMarks / NumberOfSubjects;
  char grade;
        if (AvgPercentage >= 90) 
        {
         grade = 'A';
        }
        else if (AvgPercentage >= 80)
        {
         grade = 'B';
        }
        else if (AvgPercentage >= 70)
        {
         grade = 'C';
        } 
        else if (AvgPercentage >= 60) 
        {
         grade = 'D';
        }
        else
        {
         grade = 'F';
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Percentage: " + AvgPercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}