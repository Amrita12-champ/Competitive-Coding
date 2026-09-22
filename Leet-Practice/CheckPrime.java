import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime =true;
        int count=0;
            for (int i = 2; i <= n/2; i++) {
                if (n%i==0) {
                    count ++;
                    break;
                }
            }
        if (count==1) {
            System.out.println(n + " Not a Prime Number");
        } else {
            System.out.println(n + " is Prime Number");
        }
    }
}