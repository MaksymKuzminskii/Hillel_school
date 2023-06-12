package gmail.kymaxgen;

import java.util.Scanner;

public class CounterStrike05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву команди №1: ");
        String firstTeamName = scanner.nextLine();
        System.out.printf("Введіть кількість фрагів, які настріляв кожен гравець з команди '%s' (від 0 до 30): %n", firstTeamName);
        int firstPlayerScoreTeamOne = scannerCheck();
        int secondPlayerScoreTeamOne = scannerCheck();
        int thirdPlayerScoreTeamOne = scannerCheck();
        int fourthPlayerScoreTeamOne = scannerCheck();
        int fifthPlayerScoreTeamOne = scannerCheck();

        System.out.print("Введіть назву команди №2: ");
        String secondTeamName = scanner.nextLine();
        System.out.printf("Введіть кількість фрагів, які настріляв кожен гравець з команди '%s' (від 0 до 30): %n", secondTeamName);
        int firstPlayerScoreTeamTwo = scannerCheck();
        int secondPlayerScoreTeamTwo = scannerCheck();
        int thirdPlayerScoreTeamTwo = scannerCheck();
        int fourthPlayerScoreTeamTwo = scannerCheck();
        int fifthPlayerScoreTeamTwo = scannerCheck();

        int totalScoreTeamOne = firstPlayerScoreTeamOne +
                secondPlayerScoreTeamOne +
                thirdPlayerScoreTeamOne +
                fourthPlayerScoreTeamOne +
                fifthPlayerScoreTeamOne;
        double arithmeticMeanTeamOne = (double) (firstPlayerScoreTeamOne +
                secondPlayerScoreTeamOne +
                thirdPlayerScoreTeamOne +
                fourthPlayerScoreTeamOne +
                fifthPlayerScoreTeamOne) / 5;
        int totalScoreTeamTwo = firstPlayerScoreTeamTwo +
                secondPlayerScoreTeamTwo +
                thirdPlayerScoreTeamTwo +
                fourthPlayerScoreTeamTwo +
                fifthPlayerScoreTeamTwo;
        double arithmeticMeanTeamTwo = (double) (firstPlayerScoreTeamTwo +
                secondPlayerScoreTeamTwo +
                thirdPlayerScoreTeamTwo +
                fourthPlayerScoreTeamTwo +
                fifthPlayerScoreTeamTwo) / 5;

        if (totalScoreTeamOne > totalScoreTeamTwo) { // Змінив тут об'єкти порівняння на інтеджери
            System.out.printf("Перемогла команда %s набрала %d очків; \n", firstTeamName, totalScoreTeamOne);
            System.out.printf("Середня кількість фрагів на гравця %.0f;", arithmeticMeanTeamOne);
        } else if (totalScoreTeamOne == totalScoreTeamTwo) { // і тут аналогічно до 47 строки змінив
            System.out.println("Команди мають рівну кількість очок. Перемогла дружба!");
        } else {
            System.out.printf("Перемогла команда %s набрала %d очків; \n", secondTeamName, totalScoreTeamTwo);
            System.out.printf("Середня кількість фрагів на гравця %.0f;", arithmeticMeanTeamTwo);
        }
    }

    public static int scannerCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість фрагів цього гравця: ");

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input > 30) {
                System.out.println("Ви ввели число більше за 30. Цьому гравцю автоматично присвоєно кіл-ть фрагів: 30");
                return 30;
            } else if (input < 0) {
                System.out.println("Ви ввели число менше за 0. Цьому гравцю автоматично присвоєно кіл-ть фрагів: 0");
                return 0;
            } else {
                return input;
            }
        } else {
            System.out.println("Введено не ціле число. Цьому гравцю автоматично присвоєно кіл-ть фрагів: 0");
            return 0;
        }
    }

    public static boolean equals(double firstNumber, double secondNumber) {
        double epsilon = 0.1;
        return Math.abs(firstNumber - secondNumber) < epsilon;
    }
}
