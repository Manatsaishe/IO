import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class hellovis {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("\"C:\\Users\\student\\Downloads\\hellovis.txt");
             FileOutputStream fos = new FileOutputStream("\"C:\\Users\\student\\Desktop\\Copyoffile.txt")) {
            int info;
            do {
                info = fis.read();
                if ((char) info == ' ') info = '-';
                if (info != -1) fos.write(info);
            } while (info != -1);

        } catch (IOException e) {
            System.out.println("Error IO");
        }
    }
}


