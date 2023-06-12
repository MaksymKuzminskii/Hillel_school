package gmail.kymaxgen;

import java.util.Scanner;

public class Parallelepiped03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення довжини (натуральне число): ");
        double firstBaseSide = scanner.nextDouble();
        System.out.println("Введіть значення ширини (натуральне число): ");
        double secondBaseSide = scanner.nextDouble();
        System.out.println("Введіть значення висоти (натуральне число): ");
        double height = scanner.nextDouble();

        double volume = firstBaseSide * secondBaseSide * height;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        double length = (firstBaseSide + secondBaseSide + height) * 4;
        System.out.println("Сума всіх сторін паралелепіпеда = " + length);
    }
}
