
public class ComputerGuesser implements Guesser {
    int min = -1;
    int max = 1001;
    int lastGuess;

    @Override
    public int askGuess(ResultType res) {
        if (res == ResultType.LOWER) {
            max = lastGuess;
        } else if (res == ResultType.HIGHER) {
            min = lastGuess;
        }
        lastGuess = (min + max) / 2;
        System.out.println(lastGuess);
        return lastGuess;
    }
}
