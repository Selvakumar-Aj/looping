package looping;

import java.util.Scanner;

public class Qc34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Math.abs(sc.nextInt());

        while (num >= 10)
            num /= 10;

        System.out.println("First digit = " + num);
    }
}
