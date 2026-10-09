import javax.swing.JOptionPane;

public class Ass2JOptionPane {
    public static void main(String[] args) {

        int nsat;
        double salary;
        int entrance;

        nsat = Integer.parseInt(
                JOptionPane.showInputDialog("Please enter NSAT score:")
        );

        salary = Double.parseDouble(
                JOptionPane.showInputDialog("Please enter parents' monthly salary:")
        );

        entrance = Integer.parseInt(
                JOptionPane.showInputDialog("Please enter entrance exam score:")
        );

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            JOptionPane.showMessageDialog(null, "REJECTED");
        }
        else if (salary <= 3500 &&
                (nsat + entrance) / 2.0 >= 91) {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        }
        else {
            JOptionPane.showMessageDialog(null, "FOR FURTHER STUDY");
        }
    }
}
