import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ass1BufferedReader {
    public static void main(String[]args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Enter Year: ");
            String yearInput = dataIn.readLine();
            int year = Integer.parseInt(yearInput);

            String result= (year % 400 == 0|| (year % 4 == 0 && year % 100!=0))
                    ?"A Leap Year"
                    :"Not A Leap Year";

            System.out.println(year + " is " + result);

        } catch (IOException e) {

            System.err.println("Error reading input stream.");

        } catch (NumberFormatException e) {

            System.err.println("Invalid number format. Please enter digits only.");
        }
    }
}