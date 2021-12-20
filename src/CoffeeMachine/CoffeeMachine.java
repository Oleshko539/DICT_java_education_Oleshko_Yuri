package CoffeeMachine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int type;
        int[] HAS_MACHINE = {400, 540, 120, 9, 550};
        String ACTION;
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            ACTION = scanner.nextLine();
            if (ACTION.equals("buy")) {
                type = Realization.BUY();
                if (type == 1) {
                    HAS_MACHINE = Realization.ESPRESSO(HAS_MACHINE);
                }
                if (type == 2) {
                    HAS_MACHINE = Realization.LATTE(HAS_MACHINE);
                }
                if (type == 3) {
                    HAS_MACHINE = Realization.CAPPUCCINO(HAS_MACHINE);
                }
            }
            if (ACTION.equals("fill")) {
                HAS_MACHINE = Realization.FILL(HAS_MACHINE);
            }
            if (ACTION.equals("take")) {
                HAS_MACHINE[4] = Realization.TAKE(HAS_MACHINE);
            }
            if (ACTION.equals("remaining")) {
                Realization.REMAINING(HAS_MACHINE);
            }
            if (ACTION.equals("exit")) {
                System.exit(0);
            }
        }
    }
}
class Realization {
    public static int BUY() {
        Scanner scanner = new Scanner(System.in);
        int type;
        System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino, 0 - to main menu) ");
        type = scanner.nextInt();
        return type;
    }
    public static int[] ESPRESSO(int[] HAS_MACHINE) {
        if (HAS_MACHINE[0] < 250 || HAS_MACHINE[2] < 16 || HAS_MACHINE[3] < 1) {
            System.out.println("Sorry, not enough ingredients!");
        }
        else {
            HAS_MACHINE[0] -= 250;
            HAS_MACHINE[2] -= 16;
            HAS_MACHINE[3] --;
            HAS_MACHINE[4] += 4;
            System.out.println("I have enough resources, making you a coffee!");
        }
        return HAS_MACHINE;
    }
    public static int[] LATTE(int[] HAS_MACHINE) {
        if (HAS_MACHINE[0] < 350 ||HAS_MACHINE[1] < 75 || HAS_MACHINE[2] < 20 || HAS_MACHINE[3] < 1) {
            System.out.println("Sorry, not enough ingredients!");
        }
        else {
            HAS_MACHINE[0] -= 350;
            HAS_MACHINE[1] -= 75;
            HAS_MACHINE[2] -= 20;
            HAS_MACHINE[3] --;
            HAS_MACHINE[4] += 7;
            System.out.println("I have enough resources, making you a coffee!");
        }
        return HAS_MACHINE;
    }
    public static int[] CAPPUCCINO(int[] HAS_MACHINE) {
        if (HAS_MACHINE[0] < 200 ||HAS_MACHINE[1] < 100 || HAS_MACHINE[2] < 12 || HAS_MACHINE[3] < 1) {
            System.out.println("Sorry, not enough ingredients!");
        }
        else {
            HAS_MACHINE[0] -= 200;
            HAS_MACHINE[1] -= 100;
            HAS_MACHINE[2] -= 12;
            HAS_MACHINE[3] --;
            HAS_MACHINE[4] += 6;
            System.out.println("I have enough resources, making you a coffee!");
        }
        return HAS_MACHINE;
    }
    public static int[] FILL (int[] HAS_MACHINE) {
        Scanner scanner = new Scanner(System.in);
        int wAdd, mAdd, c_bAdd, cupAdd;
        System.out.print("Write how many ml of water you want to add: ");
        wAdd = scanner.nextInt();
        wAdd +=HAS_MACHINE[0];
        System.out.print("Write how many ml of milk you want to add: ");
        mAdd = scanner.nextInt();
        mAdd+=HAS_MACHINE[1];
        System.out.println("Write how many grams of coffee beans the coffee you want to add: ");
        c_bAdd = scanner.nextInt();
        c_bAdd+=HAS_MACHINE[2];
        System.out.print("Write how many disposable coffee cups you want to add: ");
        cupAdd = scanner.nextInt();
        cupAdd +=HAS_MACHINE[3];
        int [] newHAS_MACHINE = {wAdd, mAdd, c_bAdd, cupAdd};
        return newHAS_MACHINE;
    }
    public static int TAKE (int [] HAS_MACHINE) {
        System.out.println("I gave you " + HAS_MACHINE[4]);
        int money = 0;
        return money;
    }
    public static int REMAINING (int [] HAS_MACHINE) {
        System.out.println("\nThe coffee machine has:\n" +
                HAS_MACHINE[0] + " ml of water\n" +
                HAS_MACHINE[1] +" ml of milk\n" +
                HAS_MACHINE[2] + " gram of coffee beans\n" +
                HAS_MACHINE[3] + " of disposable cups\n" +
                HAS_MACHINE[4] + " of money");
        return 0;
    }
}
