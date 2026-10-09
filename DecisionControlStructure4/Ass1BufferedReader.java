import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ass1BufferedReader {
    public static void main(String[] args) {

        BufferedReader inputDevice = new BufferedReader(new InputStreamReader(System.in));

        double height;
        int age;
        String citizenship;
        String recommendee;

        try {
            System.out.print("Enter height in cm: ");
            height = Double.parseDouble(inputDevice.readLine());

            System.out.print("Enter age: ");
            age = Integer.parseInt(inputDevice.readLine());

            System.out.print("Enter citizenship code (C/N): ");
            citizenship = inputDevice.readLine();

            System.out.print("Enter recommendee code (R/N): ");
            recommendee = inputDevice.readLine();

            if (recommendee.equalsIgnoreCase("R")) {
                System.out.println("ACCEPTED");
            } else if (height >= 200 &&
                    age >= 21 && age <= 25 &&
                    citizenship.equalsIgnoreCase("C")) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("REJECTED");
            }

        } catch (IOException e) {
            System.out.println("Input error.");

            System.out.println("Please enter valid numbers for height and age.");
        }
    }
}
