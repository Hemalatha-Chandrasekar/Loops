import java.util.Scanner;
public class Loops {
    public void MultiplicationTable(){
       int size=12;
      for(int i=1;i<=size;i++){
      for(int j=1;j<=size;j++){
         System.out.print((i*j)+"\t");
      }
      System.out.println();
      }
   }

    /**
     * Examples:Write a program that prompts the user to enter two positive integers,
     * and find their greatest common divisor (GCD).
     * Enter 2 and 4. The gcd is 2.
     * Enter 16 and 24.  The gcd is 8.
     * How do you find the gcd?
     * Name the two input integers n1 and n2.
     * You know number 1 is a common divisor, but it may not be the gcd.
     * Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
     */
   public void gcdDemo(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first positive number");
       int n1=sc.nextInt();
       System.out.println("Enter the second positive number");
       int n2=sc.nextInt();
       int a = n1;
       int b = n2;
       while (b != 0) {
           int remainder = a % b;
           a = b;
           b = remainder;
       }
       System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + a);

//       int k=(n1+n2)/2;
//       if(k%2==0){
//           System.out.println("The greatest common divisor is: "+k);
//       }else {
//           System.out.println("The least common divisor is: "+k);
//       }

   }
   public void tuitionFeePredicition(){
       // Initial tuition
       double tuition = 10000;
       double targetTuition = tuition * 2;

       double annualIncreaseRate = 0.07; // 7%
       int years = 0;
       // Calculate years until tuition doubles
       while (tuition < targetTuition) {
           tuition += tuition * annualIncreaseRate; // Increase tuition by 7%
           years++; // Increment the year counter
       }

       // Output the result
       System.out.println("The tuition will double in " + years + " years.");

   }

}


