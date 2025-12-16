package looping;

import java.util.Scanner;

public class Qc33  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char upper = sc.next().charAt(0);

        char lower = (char) (upper + 32);
        System.out.println("Lowercase = " + lower);
    }
}
