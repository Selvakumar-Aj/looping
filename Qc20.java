package looping;

import java.util.Scanner;

class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}
