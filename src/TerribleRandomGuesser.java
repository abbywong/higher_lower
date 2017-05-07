import java.util.Random;

public class TerribleRandomGuesser implements Guesser {
    private Random rand = new Random();

    @Override
    public int askGuess() {
        return rand.nextInt(1000);
    }
}
