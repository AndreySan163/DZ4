package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите число от 1 до 4: ");
        int f = scanner.nextInt();

        if (f == 1) {
            int c1 = a + b;
            System.out.println("Сумма : " + c1);
        } else if (f == 2) {
            int c2 = a - b;
            System.out.println("Разность : " + c2);
        } else if (f == 3) {
            int c3 = a * b;
            System.out.println("Произведение : " + c3);
        } else{
            int c4 = a / b;
            System.out.println("Частное : " + c4);
        }


    }
}
