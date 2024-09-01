import java.io.*;

public class s18q2 {
    public static void main(String[] args) {
        try {
            // Create a FileReader object to read the file
            FileReader fileReader = new FileReader("abc.txt");

            // Create a BufferedReader object to read the file line by line
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Convert the line to uppercase and print it
                System.out.println(line.toUpperCase());
            }

            // Close the file reader and buffered reader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}