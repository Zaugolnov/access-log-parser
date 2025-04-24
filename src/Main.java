import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
        System.out.println("Разность чисел: " + (firstNumber - secondNumber));
        System.out.println("Произведение чисел: " + (firstNumber * secondNumber));
        if (secondNumber != 0) {
            System.out.println("Частное чисел: " + ((double) firstNumber / secondNumber));
        } else {
            System.out.println("Деление на 0 не возможно");
        }

    }
}
