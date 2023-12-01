
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentScoreFile {
    public static void main(String[] args) {
        String fileName = "studentsEN.txt";
        String outputFileName = "studentsENwiths.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\student\\Downloads\\studentsEN (1).txt"));
             FileWriter fileWriter = new FileWriter("C:\\Users\\student\\Downloads\\studentsENwiths.txt")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s");
                if (words.length >= 3) {
                    String surname = words[0].trim();
                    String name = words[1].trim();
                    String score = words[2].trim();

                    if (score.equals("5")) {
                        String output = "Surname: " + surname + ", Name: " + name + ", Score: " + score + "\n";
                        fileWriter.write(output);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}