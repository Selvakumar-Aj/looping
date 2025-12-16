package looping;


import java.util.Scanner;

class DigitInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String[] words = {
            "Zero","One","Two","Three","Four",
            "Five","Six","Seven","Eight","Nine"
        };

        for (char c : n.toCharArray())
            System.out.print(words[c - '0'] + " ");
    }
}
