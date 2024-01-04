import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        playGame();
    }

    static void playGame() {
        Scanner scn = new Scanner(System.in);
        Math.random();
        int i;
        int k = (int) (Math.random() * 50) + 1;
        System.out.println("a number is chosen between 1 to 50 \nguess the number in 5 tries");

        for ( i = 0; i < 5; i++) {
            System.out.println("guess the number:");
            int answer = scn.nextInt();

            if (answer > k) {
                System.out.println("the answer is less than " + answer);
            } else if (answer < k) {
                System.out.println("the answer is greater than " + answer);
            } else {
                System.out.println("congrats! you guessed the correct number");
                break;
            }
        }
        if (i == 5){
            System.out.println("you have run out of attempts");
            System.out.println("the number was " + k);
        }
    }
}
