import java.util.Scanner;

public class StrongNo {

    static int factorial(int n) {
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isStrong(int num) {
        if (num <= 0)
        {return false;
        }
        int originalNum = num;
        int sumOfFactorials=0;
        while (num>0) {
            int digit=num%10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }
        return sumOfFactorials == originalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isStrong(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

    }
}