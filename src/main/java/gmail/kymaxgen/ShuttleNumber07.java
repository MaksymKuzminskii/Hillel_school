package gmail.kymaxgen;

public class ShuttleNumber07 {
    public static void main(String[] args) {
        int[] shuttleNums = new int[100];
        int counter = 1;
        int proposedNumber = 0;
        for (int i = 0; i < 100; ) {
            proposedNumber++;
            if (NumberCheck(proposedNumber, 4) ||
                    NumberCheck(proposedNumber, 9)) {
                continue;
            }
            shuttleNums[i] = proposedNumber;
            System.out.println("Actually #" + counter++ + " shuttle has number: " + shuttleNums[i]);
            i++;
        }
    }

    public static boolean NumberCheck(int proposedNumber, int numberToCheck) {
        String convertedNumber = String.valueOf(numberToCheck);
        return String.valueOf(proposedNumber).contains(convertedNumber);
    }
}
