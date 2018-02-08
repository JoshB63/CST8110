import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; //Decimal format


public class MarkCalculator {
   public static void main (String args[]) {
     
     MarkCalculator markcalculator = new MarkCalculator(0,0,0,0,0,0);
     markcalculator.getValues();
     markcalculator.calculateGrades();
     markcalculator.displayGrades();
     
   }
   
   private double labs = 0;
   private double assignments = 0;
   private double hybrid = 0;
   private double quiz = 0;
   private double practical = 0;
   private double fInal = 0;
   private double theoryGrade = 0;
   private double practicalGrade = 0;
   private double fInalGrade = 0;
  
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
       System.out.println("Enter the labs grade out of 10: ");
       labs = keyboard.nextDouble();
       System.out.println("Enter the assignments grade out of 20: ");
       assignments = keyboard.nextDouble();
       System.out.println("Enter the hybrid grade out of 5: ");
       hybrid = keyboard.nextDouble();
       System.out.println("Enter the quiz grade out of 25: ");
       quiz = keyboard.nextDouble();
       System.out.println("Enter the practical grade out of 10: ");
       practical = keyboard.nextDouble();
       System.out.println("Enter the final grade out of 30: ");
       fInal = keyboard.nextDouble();
     }
     
     public void calculateGrades() {
       theoryGrade = ((hybrid+quiz)/30)*100;
       practicalGrade = ((practical+labs+assignments)/40)*100;
       fInalGrade = labs+assignments+hybrid+quiz+practical+fInal;
     }
     
     public void displayGrades() {
       DecimalFormat df = new DecimalFormat("##.##"); 
       System.out.println  ("Practical Grade: "+(practicalGrade)+"%");
       System.out.println  ("Theory Grade: "+df.format(theoryGrade)+"%");
       System.out.println  ("Calculated Final Grade: "+df.format(fInalGrade)+"%");
     }
       
   
  
  


 } // end of main
