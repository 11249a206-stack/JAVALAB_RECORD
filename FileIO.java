import java.io.*;
import java.util.*;

class FileIO {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Write
        FileWriter f = new FileWriter("data.txt");

        System.out.println("Enter data:");
        String data = sc.nextLine();

        f.write(data);
        f.close();

        // Read
        FileReader r = new FileReader("data.txt");

        int ch;
        System.out.println("File data:");

        while ((ch = r.read()) != -1) {
            System.out.print((char) ch);
        }

        r.close();
        sc.close();
    }
}