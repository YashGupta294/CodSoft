public class MyNumberGame {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        java.util.Random generator = new java.util.Random();

        int totalRounds = 0;
        int totalPoints = 0;
        boolean play = true;

        System.out.println("=== Welcome to Yash's Guessing Game ===");

        while (play) {
            totalRounds++;
            int secretNumber = generator.nextInt(100) + 1;
            int triesLeft = 5;
            boolean correct = false;

            System.out.println("\nRound " + totalRounds + " starts!");
            System.out.println("I've picked a number (1 to 100). You have " + triesLeft + " chances.");

            while (triesLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = scan.nextInt();

                if (guess == secretNumber) {
                    System.out.println("✅ Bingo! You got it.");
                    totalPoints += 10;
                    correct = true;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too small... try again.");
                } else {
                    System.out.println("Too big... try again.");
                }

                triesLeft--;
                if (triesLeft > 0) {
                    System.out.println("Attempts remaining: " + triesLeft);
                }
            }

            if (!correct) {
                System.out.println("😢 You're out of tries. The number was: " + secretNumber);
            }

            System.out.print("Play another round? (y/n): ");
            String answer = scan.next().trim().toLowerCase();
            if (!answer.equals("y")) {
                play = false;
            }
        }

        System.out.println("\nThanks for playing!");
        System.out.println("Rounds played: " + totalRounds);
        System.out.println("Your score: " + totalPoints);

        scan.close();
    }
}