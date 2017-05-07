
public class PredictableGuesser implements Guesser {
    int lastGuess = 0;
    @Override
    public int askGuess(ResultType res) {
        return lastGuess++;
    }
}
