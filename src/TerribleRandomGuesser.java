import java.util.Random;

public class TerribleRandomGuesser implements Guesser {
    @Override
    public int askGuess() {
        Random rand = new Random();
        int guessNumber = rand.nextInt(1000);
        return guessNumber;
    }
}
