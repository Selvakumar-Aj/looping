package looping;


import java.util.Scanner;

class MagicNumbers {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            for (int i = 1; i <= N; i++) {
                int num = i;
                while (num > 9)
                    num = digitSum(num);

                if (num == 1)
                    System.out.print(i + " ");
            }
        }
    }
}
