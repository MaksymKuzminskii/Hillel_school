package gmail.kymaxgen.Hillel_school;

import java.util.Random;

public class Rugby08 {
    public static void main(String[] args) {
        int[] firstTeamAges = new int[25];
        int[] secondTeamAges = new int[25];
        System.out.print("У першій команді грають істоти такого віку: ");
        fillShowPrintAverage(firstTeamAges);
        System.out.print("Друга команда має гравців такого віку: ");
        fillShowPrintAverage(secondTeamAges);
    }

    public static void fillShowPrintAverage(int[] array) {
        Random random = new Random();
        int TeamTotalAge = 0;
        for (int i : array) {
            i = random.nextInt(18, 40);
            System.out.print(i + ", ");
            TeamTotalAge += i;
        }
        System.out.printf("%nСередній вік гравців цієї команди: %d;%n", Math.round((float) TeamTotalAge / 25));
    }
}
