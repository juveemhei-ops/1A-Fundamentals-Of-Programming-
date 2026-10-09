import javax.swing.JOptionPane;

public class Ass3JOptionPane {
    public static void main(String[] args) {

        String rateInput = JOptionPane.showInputDialog(
                "Enter hourly pay rate:");

        String hoursInput = JOptionPane.showInputDialog(
                "Enter hours worked:");

        double rate = Double.parseDouble(rateInput);
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

        String message =
                "Gross Pay: ₱" + grossPay +
                        "\nWithholding Tax: ₱" + withholdingTax +
                        "\nNet Pay: ₱" + netPay;

        JOptionPane.showMessageDialog(null, message);
    }
}
