package az.edu.turing.lesson07;

import java.util.Scanner;

public class FIndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % 1 == 0) {
                System.out.print(i);
            }
        }

    }
}
