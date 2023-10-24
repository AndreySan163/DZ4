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
        int d = scanner.nextInt();
        scanner.close();

        /*switch (d){
            case  1:
                System.out.println("Сумма : " + (a + b));
                break;
            case 2:
                System.out.println("Разность : " + (a - b));
                break;
            case 3:
                System.out.println("Произведение : " + (a * b));
                break;
            case 4:
                if (d == 0) {
                    System.out.println("DEL 0");
                    break;
                }
                System.out.println("Частное : " + ((double) a / b));
                break;

                default:
                System.out.println("ERROR");
        }*/

        if (d == 1) {
            System.out.println("Сумма : " + (a + b));

        } else if (d == 2) {
            System.out.println("Разность : " + (a - b));

        } else if (d == 3) {
            System.out.println("Произведение : " + (a * b));

        } else if (d == 4){
            System.out.println("Частное : " + ((double) a / b));

        }else {
            System.out.println("ERROR");
        }


    }
}
