import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] splitSentence = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder(); // using a StringBuilder for performance improvements
        for (int i = splitSentence.length - 1; i >= 0; i--) { // append to StringBuilder in reverse order.
            reversedSentence.append(splitSentence[i]).append(" ");
        }

        System.out.println("Reversed sentence is: " + reversedSentence.toString());
    }
}
