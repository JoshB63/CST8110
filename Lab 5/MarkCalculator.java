import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; //Decimal format
import java.lang.Math; //uses min function to discern between which grade is lower

public class MarkCalculator {

   private double labs = 0;
   private double assignments = 0;
   private double hybrid = 0;
   private double quiz = 0;
   private double practical = 0;
   private double fInal = 0;
   private double theoryGrade = 0;
   private double practicalGrade = 0;
   private double fInalGrade = 0;
   private String letterGrade = "F";
 
     public void getValues() {
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Welcome to the CST8110 Final Mark Calculator");
       System.out.println(" ");
     
       labs = getProperValue("Enter the labs grade out of 10: ", 10);
       assignments = getProperValue("Enter the assignments grade out of 20: ", 20);
       hybrid = getProperValue("Enter the hybrid grade out of 5: ", 5);
       quiz = getProperValue("Enter the quiz grade out of 25: ", 25);
       practical = getProperValue("Enter the practical grade out of 10: ", 10);
       fInal = getProperValue("Enter the final grade out of 30: ", 30);
 
     }
     
     public void calculateGrades() {
       theoryGrade = (fInal+practical+quiz)/0.65;
       practicalGrade = (labs+assignments)/0.30;
       
       if((theoryGrade<50.0) || (practicalGrade<50.0)){
         fInalGrade = Math.min(theoryGrade, practicalGrade);}
       else{
         fInalGrade = labs+assignments+hybrid+quiz+practical+fInal;}
       
       if(fInalGrade<=59){
         letterGrade = "F";}
       else if(fInalGrade<=62){
         letterGrade = "C-";}
       else if(fInalGrade<=66){
         letterGrade = "C";}
       else if(fInalGrade<=69){
         letterGrade = "C+";}
       else if(fInalGrade<=72){
         letterGrade = "B-";}
       else if(fInalGrade<=76){
         letterGrade = "B";}
       else if(fInalGrade<=79){
         letterGrade = "B+";}
       else if(fInalGrade<=84){
         letterGrade = "A-";}
       else if(fInalGrade<=89){
         letterGrade = "A";}
       else if(fInalGrade<=100){
         letterGrade = "A-";}
     }
     
     public void displayGrades() {
       DecimalFormat df = new DecimalFormat("##.##"); 
       System.out.println  ("Practical Grade: "+df.format(practicalGrade)+"%");
       System.out.println  ("Theory Grade: "+df.format(theoryGrade)+"%");
       System.out.println  ("Calculated Final Grade: "+df.format(fInalGrade)+"%");
       System.out.println  ("Grade Letter: "+letterGrade);
     }
     
     private double getProperValue(String prompt, double maxValue) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println(prompt);
       double value = keyboard.nextDouble();
       while ((value<0) || (value>maxValue)) {
            System.out.println("Please enter a grade between 0 and "+maxValue+": ");
            value = keyboard.nextDouble();
        }
       return value;}
       
       
   
  
  


 } // end of main
