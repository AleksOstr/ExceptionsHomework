import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {
    /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных. */
    public static float scanFloat() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter float number: ");
            float inputFloat = scanner.nextFloat();
            scanner.close();
            return inputFloat;
        } catch (InputMismatchException e) {
            System.out.println("Only float numbers allowed!");
            return scanFloat();
        }
    }

    // Задание 2
    public static void divMethod(int[] intArray, int d) {
        try {
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName());
        }
    }
}
