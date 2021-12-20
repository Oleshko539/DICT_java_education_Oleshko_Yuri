package CreditCalculator;
import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int months, years, Number_of_months;
        double principal, monthlypay, n, loan, loanNOMINAL;
        String action;
        System.out.println("What do you want to calculate?\n" +
                "type 'n' - for number of monthly payments,\n" +
                "type 'a' - for annuity monthly payment amount,\n" +
                "type 'p' - for the loan principal: ");
        action = scanner.next();
        if (action.equals("n")){
            System.out.println("Enter a loan principal: ");
            principal = scanner.nextDouble();
            System.out.println("Enter the monthly payment: ");
            monthlypay = scanner.nextDouble();
            System.out.println("Enter the loan interest: ");
            loan = scanner.nextInt();
            loanNOMINAL = loan/(12 * 100);
            n = Math.log(monthlypay/(monthlypay - (loanNOMINAL * principal)))/Math.log(1 + loanNOMINAL);
            n = Math.ceil(n);
            Number_of_months = (int) n;
            years = (Number_of_months / 12);
            months = (Number_of_months % 12);
            if (years>0 & Number_of_months >0){
                System.out.println("It will take " + years + " years and " + months + " month to repay this loan");
            } else if(years == 0){
                System.out.println("It will take " + months + " months to repay this loan");
            } else {
                System.out.println("It will take " + years + " years to repay this loan");
            }
        }
        else if (action.equals("a")){
            System.out.println("Enter the loan principal: ");
            principal = scanner.nextDouble();
            System.out.println("Enter the number of periods: ");
            months = scanner.nextInt();
            System.out.println("Enter the loan interest: ");
            loan = scanner.nextInt();
            loanNOMINAL = loan/(12 * 100);
            monthlypay = principal *((loanNOMINAL * Math.pow((1 + loanNOMINAL), months))/(Math.pow((1 + loanNOMINAL), months)-1));
            monthlypay = Math.ceil(monthlypay);
            System.out.println("Your monthly payment = "+(int)monthlypay+"!");
        }
        if (action.equals("p")) {
            System.out.println("Enter the annuity payment: ");
            monthlypay = scanner.nextDouble();
            System.out.println("Enter the number of periods: ");
            months = scanner.nextInt();
            System.out.println("Enter the loan interest: ");
            loan = scanner.nextDouble();
            loanNOMINAL = loan / (12 * 100);
            principal = monthlypay / ((loanNOMINAL * Math.pow((1 + loanNOMINAL), months)) / (Math.pow((1 + loanNOMINAL), months)-1));
            principal = Math.ceil(principal);
            System.out.println("Your loan principal "+(int)principal+"!");
        }
    }
}
