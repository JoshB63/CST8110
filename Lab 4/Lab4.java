import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; //Decimal format


public class MarkCalculator {
   public static void main (String args[]) {
     
     MarkCalculator markcalculator = new MarkCalculator();
     markcalculator.getValues();
     markcalculator.calculateGrades();
     markcalculator.displayGrades();
     
   }
  
   public MarkCalculator(double labs, double assignments, double hybrid, double quiz, double practical, double fInal){
     this.labs = labs;
     this.assignments = assignments;
     this.hybrid = hybrid;
     this.quiz = quiz;
     this.practical = practical;
     this.fInal = fInal;
     System.out.println("Mark Calculator - Version 1");
     System.out.println(" ");
   }
   
     
     
     public void getValues() {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the labs grade: ");
       labs = keyboard.nextDouble();
       System.out.println("Enter the assignments grade: ");
       assignments = keyboard.nextDouble();
       System.out.println("Enter the hybrid grade: ");
       hybrid = keyboard.nextDouble();
       System.out.println("Enter the quiz grade: ");
       quiz = keyboard.nextDouble();
       System.out.println("Enter the practical grade: ");
       practical = keyboard.nextDouble();
       System.out.println("Enter the final grade: ");
       fInal = keyboard.nextDouble();
     }
     
     public double calculateGrades() {
       theoryGrade = hybrid+quiz;
       practicalGrade = practical+labs+assignments;
       fInalGrade = labs+assignments+hybrid+quiz+practical+fInal;
     }
     
     public void displayGrades() {
       DecimalFormat df = new DecimalFormat("##.##"); 
       System.out.println  ("Practical Grade: "+df.format(practicalGrade)+"%");
       System.out.println  ("Theory Grade: "+df.format(theoryGrade)+"%");
       System.out.println  ("Calculated Final Grade: "+df.format(fInalGrade)+"%");
     }
       
   
  
  


 } // end of main
