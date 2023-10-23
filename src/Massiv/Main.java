package Massiv;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }


        int colOtrElem = 0, colPolElem = 0, colNull = 0, sumPolElem = 0, sumOtrElem = 0, sum = 0;


        for (int num : array) {

            if (num > 0) {
                colPolElem++;
                sumPolElem += num;
            }

            else if (num < 0) {
                colOtrElem++;
                sumOtrElem += num;
            }

            else {
                colNull++;
            }


            sum += num;
        }

        double sredZnachMass = (double) sum / array.length;

        System.out.println("Количество положительных элементов: " + colPolElem);
        System.out.println("Количество отрицательных элементов: " + colOtrElem);
        System.out.println("Количество нулей: " + colNull);
        System.out.println("Сумма положительных элементов: " + sumPolElem);
        System.out.println("Сумма отрицательных элементов: " + sumOtrElem);
        System.out.println("Среднее значение элементов массива: " + sredZnachMass);
    }
}