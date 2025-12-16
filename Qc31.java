package looping;

import java.util.Scanner;

public class Qc31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary = " + binary);
    }
}
