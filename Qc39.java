package looping;

import java.util.Scanner;

class Qc39  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean desc = true;
        int prev = -1;

        while (n > 0) {
            int d = n % 10;
            if (d < prev) {
                desc = false;
                break;
            }
            prev = d;
            n /= 10;
        }

        System.out.println(desc ? "Descending Order" : "Not Descending");
    }
}
