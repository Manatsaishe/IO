import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {
        FileInputStream fis;
        int info;
        try {
            fis = new FileInputStream("C:\\Users\\student\\Downloads\\hellovis.txt");

        }catch (FileNotFoundException e){
            System.out.println("File not found");
            return;
        }
        try{
            do {
                info = fis.read();
                if (info != -1) System.out.print((char)info);

            }while(info != -1);
        }catch (IOException e){
            System.out.println("Error reading file");

        }

    }
}


