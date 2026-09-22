import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check: ");
        int num= sc.nextInt();
        int originalnum=num;
        int reversednum = 0;
        while (num>0){
            int digit=num%10;
            reversednum=reversednum*10+digit;
            num=num/10;
        }
        if(originalnum==reversednum){
            System.out.println("Pallindrome");
        }else{
            System.out.println("not pallindrome");
        }


    }
}