import java.util.Scanner;

public class Ass2Scanner {
    public static void main(String[] args){
        int year;

        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Please enter the year: ");
        year = inputDevice.nextInt();

        String result = (year % 4 == 0) ? "Leap Year" : "Not a Leap Year";

        System.out.println(year + " is " + result + ".");
    }
}
