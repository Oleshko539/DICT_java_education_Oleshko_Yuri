package Hangman;
import java.util.Scanner;
import java.util.Random;

public class hangman {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("HANGMAN\n" +
                "The game will be available soon");
        String[] words = {"java","python", "javascript", "kotlin"};
        String random_word = words[random.nextInt(words.length)];
        char[] symbol = random_word.toCharArray();
        for (int i = 2; i < symbol.length; i++) {
            symbol[i] = '-';
        }
        String secret = String.valueOf(symbol);
        System.out.print("Guess the word: " + secret + ": ");
        String hidden_word = in.nextLine();
        if (random_word.equals(hidden_word)){
            System.out.println("You survived! ");
        }
        else if (!"random_word". equals(hidden_word)){
            System.out.println("You lost! ");
        }
    }
}