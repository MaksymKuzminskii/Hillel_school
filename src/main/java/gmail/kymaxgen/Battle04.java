package gmail.kymaxgen;

public class Battle04 {

    public static void main(String[] args) {
        int dynastyLiWarriorsTypeNum = 860;
        int warriorLi, archerLi, horsemanLi;
        warriorLi = 13;
        archerLi = 24;
        horsemanLi = 46;
        int warriorMin, archerMin, horsemanMin;
        warriorMin = 9;
        archerMin = 35;
        horsemanMin = 12;

        battleCalculatePrint("Лі", warriorLi, archerLi, horsemanLi, dynastyLiWarriorsTypeNum);
        battleCalculatePrint("Мінь",
                warriorMin,
                archerMin,
                horsemanMin,
                dynastyLiWarriorsTypeNum * 15 / 10);
    }

    public static void battleCalculatePrint(String dynastyNameOnUA,
                                            int warriorsPower,
                                            int archersPower,
                                            int horsemenPower,
                                            int WarriorsTypeNum) {
        int result = (warriorsPower + archersPower + horsemenPower) * WarriorsTypeNum;
        System.out.printf("Значення загальної атаки армії династії %s %d; %n", dynastyNameOnUA, result);
    }
}
