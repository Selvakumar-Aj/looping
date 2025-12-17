package looping;

public class Qc73 {
    
}

import java.util.Scanner;

class PerfectCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i * i * i <= N; i++)
            System.out.print((i * i * i) + " ");
    }
}
