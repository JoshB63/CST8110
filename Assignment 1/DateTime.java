import java.util.Scanner;//program uses scanner

public class DateTime {

  //instance variables
  private int seconds = 0;
  private int minutes = 0;
  private int hours = 0;
  private int day = 1;
  private int month = 1;
  
  public void inputSeconds() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the Seconds(0-59): ");
    seconds = keyboard.nextInt();
  }
  
  public void inputMinutes() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the minutes(0-59): ");
    minutes = keyboard.nextInt();
  }
  
  public void inputHours() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the hours(0-23): ");
    hours = keyboard.nextInt();
  }
  
  public void inputDay() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the Day(1-30): ");
    day = keyboard.nextInt();
  }
  
  public void inputMonth() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the month(1-12): ");
    month = keyboard.nextInt();
  }
  
  public String displayDate() {
    //returns string of date to be used in tandem with other external string
    return month+"/"+day+" "+hours+":"+minutes+":"+seconds;}
  
  public void display(){
    //displays via system println
    System.out.println(month+"/"+day+" "+hours+":"+minutes+":"+seconds);}
                       

  public int calcTotalSeconds(){
    //calculates total seconds since start of the year
    return ((month-1)*2592000)+((day-1)*86400)+((hours*60+minutes)*60+seconds) ;}
  
   
}
    
    
    
 
