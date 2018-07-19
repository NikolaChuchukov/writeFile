import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeInFile {

    @Test
    public static void writeInFile(){
        try {
            File file = new File("C:\\Users\\DELL\\Documents\\test1.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is ");
            fileWriter.write("a test");
            try {
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Successfully created a file!");
    }
}
