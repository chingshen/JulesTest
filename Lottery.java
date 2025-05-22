import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a simple lottery game that generates a set of unique random numbers.
 */
public class Lottery {

    /**
     * Generates a list of 6 unique random integers between 1 and 52, inclusive.
     *
     * @return A List of 6 unique integers representing the lottery numbers.
     */
    public List<Integer> generateNumbers() {
        List<Integer> lotteryNumbers = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        // Loop until 6 unique numbers are generated
        while (count < 6) {
            int number = random.nextInt(52) + 1; // Generates a number between 1 and 52
            // Check if the number is already in the list to ensure uniqueness
            if (!lotteryNumbers.contains(number)) {
                lotteryNumbers.add(number);
                count++;
            }
        }
        return lotteryNumbers;
    }

    /**
     * The main method for the Lottery program.
     * It creates a Lottery object, generates numbers, and prints them to the console.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        List<Integer> numbers = lottery.generateNumbers();
        System.out.println("Lottery Numbers: " + numbers);
    }
}
