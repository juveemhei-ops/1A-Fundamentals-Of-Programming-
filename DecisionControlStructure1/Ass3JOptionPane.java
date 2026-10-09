import javax.swing.JOptionPane;

public class Ass3JOptionPane {
    public static void main(String[] args) {

        String yearInput = JOptionPane.showInputDialog("Please enter the year");
        int year = Integer.parseInt(yearInput);

        String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                ? "Leap Year"
                : "Not a Leap Year";

        JOptionPane.showMessageDialog(null, year + " is a " + result + ".");
    }
}



