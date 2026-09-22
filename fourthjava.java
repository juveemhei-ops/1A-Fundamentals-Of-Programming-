import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthjava{
    public static void main (String[] args) {

        String filePath = "SarahJuvee.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("This is your first line of text.");
            writer.newLine();
            writer.write("This is your second line of text.");
            writer.newLine();
            writer.write("BufferedWriter makes your writing fast and efficient");
            System.out.println("Data successfully written to the file");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }}
