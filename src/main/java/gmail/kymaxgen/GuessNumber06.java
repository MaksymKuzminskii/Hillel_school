package gmail.kymaxgen;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int theNumber = random.nextInt(10);
        System.out.println("Правила гри прості - маєте вгадати натуральне число від 0 до 9 включно");
        for (int i = 2; i >= 0; i--) {
            System.out.print("Введіть ваш варіант відповіді: ");
            int input = scanner.nextInt();
            if (input == theNumber) {
                System.out.println("Неймовірно, ви вгадали! Це дійсно було число " + theNumber);
                break;
            } else {
                System.out.println("Ні, це не те число, маєте ще кількість спроб: " + i);
                if (i == 0) {
                    System.out.println("На цьому гру закінчено. Капець, нажаль ви не вгадали((");
                }
            }
        }
    }
}
