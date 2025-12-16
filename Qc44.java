package looping;
import java.util.Scanner;

class EvenOddMixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean even = false, odd = false;

        while (n > 0) {
            if ((n % 10) % 2 == 0) even = true;
            else odd = true;
            n /= 10;
        }

        if (even && odd)
            System.out.println("Mixed Digits");
        else if (even)
            System.out.println("All Even Digits");
        else
            System.out.println("All Odd Digits");
    }
}
