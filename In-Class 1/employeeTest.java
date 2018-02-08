public class employeeTest {
  
  public static void main(String[] args){
    
    Employee emp1 = new Employee("John","Smith",8000.00);
    Employee emp2 = new Employee("Jim","Johnson",7000.00);
    
    System.out.println("Employee 1 Data - First Name: "+emp1.getFirstName()+", Last Name: "+emp1.getLastName()+", Salary: "+emp1.getSalary()+".");
    
  }
}