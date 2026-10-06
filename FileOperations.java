import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FileOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Open/Create file
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write data to file
            FileWriter writer = new FileWriter(file);

            System.out.println("Enter the data you want to write:");
            String data = sc.nextLine();

            writer.write(data);
            writer.close();

            System.out.println("Data written successfully.");

            // Read data from file
            FileReader reader = new FileReader(file);

            int ch;
            System.out.println("\nData in the file:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close file
            reader.close();

            System.out.println("\n\nFile closed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}