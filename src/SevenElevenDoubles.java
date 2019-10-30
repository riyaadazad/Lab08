public class SevenElevenDoubles {
    public static void main(String[] args) {
        int sevenCount = 0;
        int elevenCount = 0;
        int doubleCount = 0;
        String combinedPercentage = "0.00%";

        Die dieX =  new Die(6);
        Die dieY = new Die(6);

        for (int i = 0; i < 100000; i++) {
            dieX.roll();
            System.out.println(dieX.getFaceValue());
        }

        for (int i = 0; i < 100000; i++) {
            dieY.roll();
            System.out.println(dieY.getFaceValue());
        }

        System.out.println("A 7 was rolled " + sevenCount + " times.");
        System.out.println("An 11 was rolled " + elevenCount + " times.");
        System.out.println("A double was rolled " + doubleCount + " times.");
        System.out.println("Percentage of combined cases: " + combinedPercentage);
    }
}
