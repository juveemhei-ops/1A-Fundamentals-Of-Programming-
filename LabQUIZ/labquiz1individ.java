import javax.swing.JOptionPane;

public class labquiz1individ {
    public static void main(String[] args ){
        double  OldSalary ;
        double increase;
        double NewSalary;
        double RetroActivePay;

        OldSalary= Double.parseDouble(JOptionPane.showInputDialog("Please Enter Your Old Salary: "));

       increase = OldSalary * 0.1775;
       NewSalary = OldSalary+increase;
       RetroActivePay= increase * 2;

         String msg = "Your new salary is: "+ NewSalary ;
        JOptionPane.showMessageDialog(null,msg);


    }

}
