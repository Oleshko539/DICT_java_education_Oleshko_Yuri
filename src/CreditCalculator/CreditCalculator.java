package CreditCalculator;
import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int principal, monthlypay, lastpay, months;
        String action;
        System.out.println("Enter the loan principal: ");
        principal = scanner.nextInt();
        System.out.println("What do you want to calculate?\n" +
                "type 'm' – for number of monthly payments,\n" +
                "type 'p' – for the monthly payment: ");
        action = scanner.next();
        if (action.equals("m")){
            System.out.println("Enter the monthly payment: ");
            monthlypay = scanner.nextInt();
            if (principal%monthlypay > 0){
                months = principal/monthlypay + 1;
            }
            else{
                months = principal/monthlypay;
            }
            System.out.println("It will take " + months + " months to repay the credit");
        }
        if (action.equals("p")) {
            System.out.println("Enter number of month: ");
            months = scanner.nextInt();
            if (principal/months > 0){
                monthlypay = principal/months + 1;
                lastpay = principal - (months - 1) * monthlypay;
                System.out.println("Your monthly payment = "+monthlypay+" and the last payment = "+lastpay);
            }
            else{
                monthlypay = principal/months;
                System.out.println("Your monthly payment = "+ monthlypay);
            }
        }
    }
}
