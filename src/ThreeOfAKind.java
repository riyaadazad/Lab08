public class ThreeOfAKind {

    public static void main(String[] args) {
        Die sixSidedDie = new Die(6);
        Die fiveSidedDie = new Die(5);
        Die fourSidedDie = new Die(4);

        System.out.println("Automatically rolling the six-sided die 5000 times. Please wait.");
        for (int i = 0; i < 5000; i++) {
            sixSidedDie.roll();
            System.out.println(sixSidedDie.getFaceValue());
        }
        System.out.println("End Rolling of Six-Sided Die.");

        System.out.println("Automatically rolling the five-sided die 5000 times. Please wait.");
        for (int x = 0; x < 5000; x++) {
            fiveSidedDie.roll();
            System.out.println(fiveSidedDie.getFaceValue());
        }
        System.out.println("End Rolling of Five-Sided Die.");

        System.out.println("Automatically rolling the four-sided die 5000 times. Please wait.");
        for (int y = 0; y < 5000; y++) {
            fourSidedDie.roll();
            System.out.println(fourSidedDie.getFaceValue());
        }
        System.out.println("End Rolling of Four-Sided Die.");

        System.out.println("GAME OVER. Three-of-a-Kind was rolled " + " times.");
    }
}
