package TaskTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTwo {

    public static void runTaskTwo() {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Число не целое");
            return;
        }
        int i = 2;
        while (number > 1) {
            if (number % i==0)
            {
                System.out.print(i+ " ");
                while (number % i==0) {
                    number /= i;
                }
                i=2;
            }
            else
            {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        TaskTwo.runTaskTwo();
    }
}
