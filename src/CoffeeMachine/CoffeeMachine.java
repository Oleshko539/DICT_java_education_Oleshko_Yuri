package CoffeeMachine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int  w = 400, m = 540, c_b = 120, cup = 9, money =550, type;
        String ACTION;
        while(true){
            System.out.println("The coffee machine has: \n" +
                    w+" ml of water\n" +
                    m+" ml of milk\n" +
                    c_b+" gram of coffee beans\n" +
                    cup+" of disposable cups\n" +
                    money+" of money");
            System.out.println("Write action (buy, fill, take): ");
            ACTION = scanner.nextLine();
            if (ACTION.equals("buy")){
                System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino) ");
                type = scanner.nextInt();
                if (type == 1) {
                    w -= 250;
                    c_b -= 16;
                    cup --;
                    money += 4;
                }
                else if (type == 2) {
                    w -= 350;
                    m -= 75;
                    c_b -= 20;
                    cup --;
                    money += 7;
                }
                else if (type == 3) {
                    w -= 200;
                    m -= 100;
                    c_b -= 12;
                    cup --;
                    money += 6;
                }
            }
            if (ACTION.equals("fill")){
                System.out.println("Write how many ml of water you want to add: ");
                w += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                m += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans the coffee you want to add: ");
                c_b += scanner.nextInt();
                System.out.println("Write how many disposable coffee cups you want to add: ");
                cup += scanner.nextInt();
            }
            if (ACTION.equals("take")){
                System.out.println("I gave you "+money);
                money = 0;
            }
        }
    }
}
