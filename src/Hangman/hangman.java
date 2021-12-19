package Hangman;
//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("HANGMAN\n" +
                "The game will be available soon");
        ArrayList<String> someLetters = new ArrayList<>();
        String[] words = {"java", "python", "javascript", "kotlin"};
        String random_word = words[random.nextInt(words.length)];
        StringBuffer secret = new StringBuffer(random_word);
        char[] symbol = random_word.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            secret.setCharAt(i,'-');
        }
        short attempt = 8;
        boolean cycle = true;
        while (cycle) {
            if (attempt > 0) {
                System.out.print(secret + "\nInput a letter: ");
                String letter = scanner.nextLine();
                if (random_word.contains(letter)) {
                    if (someLetters.contains(letter)) {
                    System.out.println("No improvements");
                    attempt--;
                }
                else {
                    for (int i = 0; i < random_word.length(); i++) {
                        if (symbol[i] == letter.charAt(0)) {
                            secret.setCharAt(i, letter.charAt(0));
                        }
                    }
                }
                    if (secret.toString().equals(random_word)) {
                        System.out.println(random_word + "\nThanks for playing!\n" +
                                "Well see how well you did in the next stage");
                        break;
                    }
                }
                else {
                    System.out.println("That letter doesn`t appear in the word.");
                    attempt--;
                }
                someLetters.add(letter);
            }
            else {
                System.out.println("You Lost!");
                break;
            }
        }
    }
}
