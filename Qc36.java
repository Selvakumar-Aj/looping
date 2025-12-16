package looping;

import java.util.Scanner;

public class Qc36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        boolean found = false;

        while (num != 0) {
            if (num % 10 == digit) {
                found = true;
                break;
            }
            num /= 10;
        }

        System.out.println(found ? "Digit found" : "Digit not found");
    }
}
