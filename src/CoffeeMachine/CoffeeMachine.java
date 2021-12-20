package CoffeeMachine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int  w = 400, m = 540, c_b = 120, cup = 9, money =550, type;
        String ACTION;
        while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            ACTION = scanner.nextLine();
            if (ACTION.equals("buy")) {
                while (true) {
                    System.out.println("Choose your coffee: (1 - Espresso, 2 - Latte, 3 - Cappuccino, 0 - to main menu) ");
                    type = scanner.nextInt();
                    if (type == 1) {
                        if (w < 250 || c_b < 16 || cup < 1) {
                            System.out.println("Sorry, not enough ingredients!");
                        }
                        else {
                            w -= 250;
                            c_b -= 16;
                            cup--;
                            money += 4;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (type == 2) {
                        if (w < 350 || m < 75 || c_b < 20 || cup < 1) {
                            System.out.println("Sorry, not enough ingredients!");
                        } else {
                            w -= 350;
                            m -= 75;
                            c_b -= 20;
                            cup--;
                            money += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (type == 3) {
                        if (w < 200 || m < 100 || c_b < 12 || cup < 1) {
                            System.out.println("Sorry, not enough ingredients!");
                        } else {
                            w -= 200;
                            m -= 100;
                            c_b -= 12;
                            cup--;
                            money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    }
                    if (type == 0){
                        break;
                    }
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
            if (ACTION.equals("remaining")){
                System.out.println("\nThe coffee machine has:\n" +
                        w + " ml of water\n" +
                        m +" ml of milk\n" +
                        c_b + " gram of coffee beans\n" +
                        cup + " of disposable cups\n" +
                        money + " of money");
            } if (ACTION.equals("exit")) {
                System.exit(0);
            }
        }
    }
}
