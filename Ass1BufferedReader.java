import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ass1BufferedReader {
    public static void main(String[] args){

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter NSAT score: ");
            int nsat = Integer.parseInt(dataIn.readLine());

            System.out.print("Enter parents' monthly salary: ");
            double salary = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter entrance exam score: ");
            int entrance = Integer.parseInt(dataIn.readLine());

            if (salary > 10000 || nsat < 90 || entrance < 85) {

                System.out.println("REJECTED");

            } else if (salary <= 3500 && (nsat + entrance) / 2.0 >= 91) {

                System.out.println("ACCEPTED");

            } else {
                System.out.println("FOR FURTHER STUDY");}

        } catch (IOException e) {

            System.out.println("Error reading input stream.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid number format. Please enter numbers only.");
        }
    }
}