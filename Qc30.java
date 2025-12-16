package looping;
import java.util.Scanner;
public class Qc30  {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String binary = sc.next();

            int ones = 0, zeros = 0;
            for (char ch : binary.toCharArray()) {
                if (ch == '1') ones++;
                else if (ch == '0') zeros++;
            }

            System.out.println("1s = " + ones);
        }
        System.out.println("0s = " + zeros);
    }
}
