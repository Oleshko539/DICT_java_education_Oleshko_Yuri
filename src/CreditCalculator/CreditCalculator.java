package CreditCalculator;

public class CreditCalculator {
    public static void main(String[] args){
        double principal, monthlyPay, loan, loanNOMINAL, n, diff, overpayment = 0;
        int months, years, NumberOfMonths;
        String action = System.getProperty("action");
        String loanPrincipal = System.getProperty("principal");
        String pay = System.getProperty("pay");
        String interest = System.getProperty("loan");
        String period = System.getProperty("period");
        if (action != null){
            if (action.equals("annuity")){
                if (loanPrincipal != null && pay != null && interest != null) {
                    principal = Double.parseDouble(loanPrincipal);
                    monthlyPay = Double.parseDouble(pay);
                    loan = Double.parseDouble(interest);
                    loanNOMINAL = loan / (12 * 100);
                    n = Math.log(monthlyPay/(monthlyPay -(loanNOMINAL * principal)))/Math.log(1 + loanNOMINAL);
                    NumberOfMonths = (int)Math.ceil(n);
                    years = (NumberOfMonths/12);
                    months = (NumberOfMonths % 12);
                    if (years > 0 & months > 0) {
                        System.out.println("It will take " + years + " years and " + months + " months to repay this loan!");
                    }
                    else if (years == 0) {
                        System.out.println("It will take " + months + " months to repay this loan");
                    }
                    else {
                        System.out.println("It will take " + years + " years to repay this loan");
                    }
                }
                else if (loanPrincipal != null && period != null && interest != null) {
                    NumberOfMonths = Integer.parseInt(period);
                    principal = Double.parseDouble(loanPrincipal);
                    loan = Double.parseDouble(interest);
                    loanNOMINAL = loan / (12 * 100);
                    monthlyPay = principal * ((loanNOMINAL * Math.pow((1 + loanNOMINAL), NumberOfMonths))/(Math.pow((1 + loanNOMINAL), NumberOfMonths) - 1));
                    monthlyPay = Math.ceil(monthlyPay);
                    System.out.println("Your monthly payment "+(int)monthlyPay+"!");
                }
                else if (period != null && pay != null && interest != null) {
                    NumberOfMonths = Integer.parseInt(period);
                    loan = Double.parseDouble(interest);
                    monthlyPay = Double.parseDouble(pay);
                    loanNOMINAL = loan / (12 * 100);
                    principal = monthlyPay/((loanNOMINAL * Math.pow((1 + loanNOMINAL), NumberOfMonths))/(Math.pow((1 + loanNOMINAL), NumberOfMonths) - 1));
                    principal = Math.ceil(principal);
                    System.out.println("Your loan principal "+(int)principal+"!");
                }
                else {
                    System.out.println("Incorrect parameters.");
                    System.exit(0);
                }
            }
            else if (action.equals("Diff")){
                if (loanPrincipal == null || period == null || interest == null) {
                    System.out.println("Incorrect parameters.");
                    System.exit(0);
                }
                NumberOfMonths = Integer.parseInt(period);
                principal = Double.parseDouble(loanPrincipal);
                loan = Double.parseDouble(interest);
                loanNOMINAL = loan / (12 * 100);
                for (int N = 1; N <= NumberOfMonths; N ++) {
                    diff = principal / NumberOfMonths + loanNOMINAL * (principal - ((principal * (N - 1)) / (NumberOfMonths)));
                    diff = Math.ceil(diff);
                    overpayment = overpayment + (diff - (principal / NumberOfMonths));
                    System.out.println("Month " + N + ": payment is " + (int)diff);
                }
                System.out.println("Overpayment " + (int)overpayment);
            }
            else{
                System.out.println("Incorrect parameters.");
                System.exit(0);
            }
        }
        else {
            System.out.println("Incorrect parameters.");
            System.exit(0);
        }
    }
}
