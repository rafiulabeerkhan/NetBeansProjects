package brofileread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BroFileRead {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\B7\\Documents\\NetBeansProjects\\broFileWriter\\Ruma.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
