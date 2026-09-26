import java.util.Scanner;

public class AmstrongNum {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number to check: ");
       int number= sc.nextInt();
       int remainder;
       int sum= 0;
       while (number> 0) {
           remainder=number % 10;
           sum+=(remainder * remainder * remainder);
           number/=10;
       }



   }


}