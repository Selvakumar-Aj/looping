package looping;

import java.util.Scanner;

class AscendingDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean asc = true;
            int prev = 10;

            while (n > 0) {
                int d = n % 10;
                if (d > prev) {
                    asc = false;
                    break;
                }
                prev = d;
                n /= 10;
            }

            System.out.println(asc ? "Ascending Order" : "Not Ascending");
        }
    }
}
