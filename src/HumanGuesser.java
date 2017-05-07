import java.util.Scanner;

public class HumanGuesser implements Guesser {
    @Override
    public int askGuess() {
        System.out.println("pls input one answer");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}
