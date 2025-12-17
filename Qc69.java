package looping;

public class Qc69 {
    
}
import java.util.Scanner;

class Qc69  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0 || i % 10 == 7)
                System.out.print(i + " ");
        }
    }
}
