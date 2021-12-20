package CoffeeMachine;
import java.util.Scanner;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int cups, wHAS, mHAS, c_bHAS, w = 200, m = 50, c_b = 15;
        int[] HAS;
        System.out.println("Write how many ml of water the coffee machine has:");
        wHAS = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        mHAS = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        c_bHAS = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();
        HAS = new int[] {wHAS/w, mHAS/m, c_bHAS/c_b};
        var minCups = Arrays.stream(HAS).min().getAsInt();
        if (minCups > cups){
            cups = minCups - cups;
            System.out.print("Yes, I can make that amount of coffee (and even " +cups+ " more than that)");
        }
        else if (minCups == cups){
            System.out.print("Yes, I can make that amount of coffee");
        }
        else{
            System.out.print("No, I can only "+minCups+" cups of coffee");
        }
    }
}
