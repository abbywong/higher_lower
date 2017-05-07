
public class Main {
    public static void main(String[] args) {
        Answerer gameMaster = new Answerer();
        Guesser player = new PredictableGuesser();
        ResultType res = ResultType.IS_FIRST;
        while (res != ResultType.CORRECT) {
            int guess = player.askGuess(res);
            res = gameMaster.checkGuess(guess);
            System.out.println(res);
        }
        System.out.printf("Congratulations! You made it in %d tries!\n", gameMaster.getGuessCount());
    }
}
