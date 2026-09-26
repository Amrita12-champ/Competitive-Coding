import java.util.Scanner;

public class ReversedOfNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to reverse ");
        int num= sc.nextInt();
        int reversednum = 0;
        while(num>0){
            int digit=num%10;
            reversednum=reversednum*10+digit;
            num=num/10;
        }
        System.out.println("reversed num is " + reversednum);

    }
}