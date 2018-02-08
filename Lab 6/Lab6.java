import java.util.Scanner;
import java.lang.Math; 

public class Lab6 {
 
 //variables
 private double firstTerm;
 private double commonRatio;
 private double precision;
 private double total;
 private double rounded;

 public void getValues() {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Program developed by JoshB63" + "\nGeometric series calculator");
  System.out.print("\nFirst term: ");
  firstTerm = input.nextDouble();
  while (firstTerm < 0 || firstTerm == 0) {
   System.out.print("Please select a non zero value, First term: ");
   firstTerm = input.nextDouble();
  }
  System.out.print("Common Ratio: ");
  commonRatio = input.nextDouble();
  while (commonRatio <= -1 || commonRatio >= 1) {
   System.out.print("Please select a value between -1 and 1 , Common Ratio: ");
   commonRatio = input.nextDouble();
  }
  System.out.print("Precision: ");
  precision = input.nextDouble();
  while (precision < 0) {
   System.out.print("Please select a non negative value, Precision: ");
   precision = input.nextDouble();
  }
 }

 public void calculateSeries() {
  total = 0;
  double term = firstTerm;
  while (term > precision || -term > precision) {
   total = total + term;
   term = term * commonRatio;
  }
 }

 public void display() {
  
  if(precision == 0.0) {
   rounded =  Math.round(total);
  } else {
   rounded = Math.round(total/precision)*precision;
  }
  System.out.print("Total = " + rounded);
 }
}
