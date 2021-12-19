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
        System.out.println("Enter word: ");
        String WORD = in.nextLine();
        if (WORD.equals(random_word)){
            System.out.println("You survived! ");
        }
        else if (!"WORD". equals(random_word)){
            System.out.println("You lost! ");
        }
    }
}
