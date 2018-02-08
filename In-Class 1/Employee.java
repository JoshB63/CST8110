public class Employee {
  
  private String firstName;
  private String lastName;
  private double monthlySalary;
  
  public Employee(String name1, String name2, double salary) {
    
    firstName = name1;
    lastName = name2;
    monthlySalary = salary;
  }
  
  public void SetFirstName(String name) {
    firstName = name;}
  
  public void SetLastName(String name){
    lastName = name;}
  
  public void SetSalary(double salary){
    monthlySalary = salary;}
  
  public String getFirstName(){
    return firstName;}
  
  public String getLastName(){
    return lastName;}
  
  public double getSalary(){
    return monthlySalary;}
  
}
    
    
    
 
