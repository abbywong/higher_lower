import java.util.Random;

public class Answerer {
    private int secretNumber;

    public Answerer() {
        Random rand = new Random();
        secretNumber = rand.nextInt(1000);
    }

    public ResultType checkGuess(int inputAnswer) {
        if (inputAnswer > secretNumber) {
            return ResultType.LOWER;
        } else if (inputAnswer < secretNumber) {
            return ResultType.HIGHER;
        } else {
            return ResultType.CORRECT;
        }
    }
}
