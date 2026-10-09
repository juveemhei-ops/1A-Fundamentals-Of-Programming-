import java.util.Scanner;

public class Ass2Scanner {
    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);

        double height;
        int age;
        String citizenship;
        String recommendee;

        System.out.print("Enter height in cm: ");
        height = inputDevice.nextDouble();

        System.out.print("Enter age: ");
        age = inputDevice.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        citizenship = inputDevice.next();

        System.out.print("Enter recommendee code (R/N): ");
        recommendee = inputDevice.next();

        if (recommendee.equalsIgnoreCase("R")) {
            System.out.println("ACCEPTED");
        } else if (height >= 200 &&
                age >= 21 && age <= 25 &&
                citizenship.equalsIgnoreCase("C")) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
    }
}