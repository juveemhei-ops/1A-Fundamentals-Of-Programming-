import java.util.Scanner;

public class Ass3Scanner {
    public static void main(String[] args) {

        int nsat;
        double salary;
        int entrance;

        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Please enter NSAT score: ");
        nsat = inputDevice.nextInt();

        System.out.print("Please enter parents' monthly salary: ");
        salary = inputDevice.nextDouble();

        System.out.print("Please enter entrance exam score: ");
        entrance = inputDevice.nextInt();

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        }
        else if (salary <= 3500 &&
                (nsat + entrance) / 2.0 >= 91) {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("FOR FURTHER STUDY");
        }
    }
}