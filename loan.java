import java.util.Scanner;
class loan{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		double loanAmount =ip.nextInt();
		System.out.println("Enter the number of years: ");
		double ty = ip.nextFloat();
		System.out.println("Interest Rate        Monthly Payment                  Total Payment");
		double interestRate = 5.0;
		while(interestRate <= 8){
			//double montlyInterestRate = interestRate/12;
			System.out.print(interestRate+"                  ");
			double monthlyInterestRate = interestRate / 12 / 100;
			double months = ty* 12;
			double nominator = (loanAmount * monthlyInterestRate);
			double denominator =( 1-Math.pow(1+monthlyInterestRate,-months));
			double monthlyPayment = nominator/denominator;
			System.out.print(monthlyPayment+"                   ");

			double totalPayment = monthlyPayment * ty* 12;
			System.out.print(totalPayment);
			interestRate = interestRate + 0.125;
			System.out.println();

		}
	}
}

