import java.text.DecimalFormat;

public class DateTimeTester {
 static public void main(String[] argv)
 {
  DecimalFormat df=new DecimalFormat("#,###");
  System.out.println("DateTime Tester");

  System.out.println("\nDefault test");
  DateTime dateTime=new DateTime();
  System.out.print("Default date is ");
  dateTime.display();
  System.out.println(df.format(dateTime.calcTotalSeconds())+" seconds since start of year");
  
  System.out.println("\nUser input test");
  dateTime.inputMonth();
  dateTime.inputDay();
  dateTime.inputHours();
  dateTime.inputMinutes();
  dateTime.inputSeconds();
  System.out.print("Entered date is ");
  dateTime.display();
  System.out.println(df.format(dateTime.calcTotalSeconds())+" seconds since start of year");
 }

}