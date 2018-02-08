import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; //Decimal format


public class Assign2 {
   public static void main (String args[]) {
     
     //creates new insatnce/object of the the TimeCalculator class.
     TimeCalculator date = new TimeCalculator();
     
     //runs three main TimeCalculator functions.
     date.enterDates();
     date.calculateDifference();
     date.display();
     
   }//end of main
 } // end of class
