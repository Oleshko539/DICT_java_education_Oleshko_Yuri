package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int cups, w = 200, m = 50, c_b = 15;
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();
        System.out.println("For "+cups+" cups of coffee you will need: \n" +
                cups*w+" ml of water\n" +
                cups*m+" ml of milk\n" +
                cups*c_b+" g of coffee beans");
    }
}
