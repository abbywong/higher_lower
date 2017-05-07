
public class Main {
    public static void main(String[] args) {
        Answerer gameMaster = new Answerer();
        Guesser player = new ComputerGuesser();
        ResultType res = ResultType.IS_FIRST;
        while (res != ResultType.CORRECT) {
            int guess = player.askGuess(res);
            res = gameMaster.checkGuess(guess);
            System.out.println(res);
        }
    }
}
