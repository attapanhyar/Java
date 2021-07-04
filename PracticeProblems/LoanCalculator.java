/*
Chapter 4 Sample Development: Loan Calculation (Step 1)
File: Step1/LoanCalculator.java
*/
package PracticeProblems;
import java.util.*;
class LoanCalculator {
//Data members
private Loan loan;
//Main method
public static void main(String[] arg) {
				LoanCalculator calculator = new LoanCalculator();
				calculator.start();
}
//Constructor
public LoanCalculator() {
			loan = new Loan();
}
// Top-level method that calls other private methods
public void start() {
describeProgram(); //tell what the program does
getInput(); //get three input values
computePayment(); //compute the monthly payment and total
displayOutput(); //display the results
}
// Computes the monthly and total loan payments
private void computePayment() {
System.out.println("inside computePayment"); //TEMP
}
// Provides a brief explanation of the program to the user
private void describeProgram() {
System.out.println
("This program computes the monthly and total");
System.out.println
("payments for a given loan amount, annual ");
System.out.println
("interest rate, and loan period (# of years).");
System.out.println("\n");
}
// Displays the input values and monthly and total payments
private void displayOutput() {
System.out.println("Loan Amount: $" + loan.getAmount());

System.out.println("Annual Interest Rate:"
+ loan.getRate() + "%");
System.out.println("Loan Period (years): " + loan.getPeriod());
System.out.println("Monthly payment is $ " +
loan.getMonthlyPayment());
System.out.println(" TOTAL payment is $ " +
loan.getTotalPayment());

 //TEMP
}

// Gets three input values—loan amount, interest rate, and
// loan period—using an InputBox object
private void getInput() {
double loanAmount, annualInterestRate;
int loanPeriod;
Scanner scanner = new Scanner(System.in);
System.out.print("Loan Amount (Dollars+Cents):");
loanAmount = scanner.nextDouble();
System.out.print("Annual Interest Rate (e.g., 9.5):");
annualInterestRate = scanner.nextDouble();
System.out.print("Loan Period - # of years:");
loanPeriod = scanner.nextInt();
//create a new loan with the input values
loan = new Loan(loanAmount, annualInterestRate,loanPeriod);
//TEMP
System.out.println("Loan Amount: $" + loan.getAmount());
System.out.println("Annual Interest Rate:"
+ loan.getRate() + "%");
System.out.println("Loan Period (years):" + loan.getPeriod());

}
}
class Loan {
private static final int MONTHS_IN_YEAR = 12;
private double loanAmount;
private double monthlyInterestRate;
private int numberOfPayments;
public Loan(){}

public Loan(double amount, double rate, int period) {
			setAmount(amount);
			setRate (rate );
			setPeriod(period);
}
public double getAmount( ) {
return loanAmount;
}
public void setAmount(double amount) {
loanAmount = amount;
}
public void setRate(double annualRate) {
monthlyInterestRate = annualRate / 100.0 / MONTHS_IN_YEAR;
}
public double getRate( ) {
return monthlyInterestRate * 100.0 * MONTHS_IN_YEAR;
}
public void setPeriod(int periodInYears) {
numberOfPayments = periodInYears * MONTHS_IN_YEAR;
}
public int getPeriod( ) {
return numberOfPayments / MONTHS_IN_YEAR;
}

public double getMonthlyPayment( ) {
double monthlyPayment;
monthlyPayment = (loanAmount * monthlyInterestRate)
/
(1 - Math.pow(1/(1 + monthlyInterestRate),
numberOfPayments ) );
return monthlyPayment;




//
public double getTotalPayment( ) {
double totalPayment;
totalPayment = getMonthlyPayment( ) * numberOfPayments;
return totalPayment;
}

}