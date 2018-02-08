import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; //Decimal format


public class Lab5 {
   public static void main (String args[]) {
     
     MarkCalculator markcalculator = new MarkCalculator();
     markcalculator.getValues();
     markcalculator.calculateGrades();
     markcalculator.displayGrades();
     
   }
}
  
  