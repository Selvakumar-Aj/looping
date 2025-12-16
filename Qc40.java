package looping;

import java.util.Scanner;

class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, digits = 0;

        int last = n % 10;
        while (temp >= 10) {
            temp /= 10;
            digits++;
        }
        int first = temp;

        int middle = (n % (int)Math.pow(10, digits)) / 10;
        int result = last * (int)Math.pow(10, digits) + middle * 10 + first;

        System.out.println("After Swap = " + result);
    }
}
