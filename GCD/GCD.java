import java.util.Scanner;

public class GCD {
  
  private int value1;
  private int value2;
  private int gcd;
  
  public void getValues(){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter value 1: ");
    value1 = input.nextInt();
    while (value1<=0) {
      System.out.print("Please enter a value that is greater than 0: ");
      value1 = input.nextInt();}
    
    System.out.println("Please enter value 2: ");
    value2 = input.nextInt();
    while (value2<=0) {
      System.out.print("Please enter a value that is greater than 0: ");
      value2 = input.nextInt();}
      }
  
  public void calculateGcd() {
    
    int a = value1;
    int b = value2;
    
    while(b!=0){
      int temp = a%b;
      a=b;
      b=temp;}
    
    gcd = a;}
  
  public void display() {
    
    System.out.println("The greatest common divisor of "+value1+" and "+value2+" is "+gcd);}
    

 public static void main(String[] args) {


 }

}
