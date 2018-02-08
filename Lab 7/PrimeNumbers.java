import java.util.Scanner;
import java.lang.Math; 

public class PrimeNumbers {
 
 //variables.
 private int numberOfPrimes;


 public void getNumberFromUser() {
  //Initializes scanner object.
  Scanner input = new Scanner(System.in);
 
  System.out.print("\nNumber of primes: ");
  numberOfPrimes = input.nextInt();
  while (numberOfPrimes < 0 || numberOfPrimes == 0) {
   System.out.print("You need to generate at least one prime number: ");
   numberOfPrimes = input.nextInt();}
  
  ;

 }

 public void generatePrimes() {
  int i = 0;
  int num =1;
  int x = 0;
  int[] primes = new int[numberOfPrimes];
  
  for (i = 1; i < 1000000;i++){ 
    
    if(x==numberOfPrimes){
      break;}
    if(isPrime(num)){
      primes[x] = num;
      x++;}
    num++;
   
       }
  
  System.out.println("The first "+numberOfPrimes+" prime numbers are:");
   
   for(int j=0; j<numberOfPrimes; j++ ){
     System.out.println((j+1)+"    "+primes[j]);}
 }
 
 private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}

  

}
