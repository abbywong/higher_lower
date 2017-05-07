
public class Main {
    public static void main(String[] args) {
        Answerer gameMaster = new Answerer();
        Guesser player = new Guesser();
        ResultType res = ResultType.HIGHER;
        while (res != ResultType.CORRECT) {
            int guess = player.askGuess();
            res = gameMaster.checkGuess(guess);
            System.out.println(res);
        }
    }
}
