import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ass1BufferedReader {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(
                new InputStreamReader(System.in));

        try {

            System.out.print("Enter hourly pay rate: ");
            String rateInput = dataIn.readLine();
            double rate = Double.parseDouble(rateInput);

            System.out.print("Enter hours worked: ");
            String hoursInput = dataIn.readLine();
            double hours = Double.parseDouble(hoursInput);

            double grossPay = rate * hours;
            double taxRate;

            if (grossPay <= 2000) {
                taxRate = 0.10;
            } else if (grossPay <= 4000) {
                taxRate = 0.12;
            } else if (grossPay <= 10000) {
                taxRate = 0.15;
            } else {
                taxRate = 0.20;
            }

            double withholdingTax = grossPay * taxRate;
            double netPay = grossPay - withholdingTax;

            System.out.println("Gross Pay: " + grossPay);
            System.out.println("Withholding Tax: " + withholdingTax);
            System.out.println("Net Pay: " + netPay);

        } catch (IOException e) {
            System.err.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.err.println("Please enter numbers only.");
        }
    }
}