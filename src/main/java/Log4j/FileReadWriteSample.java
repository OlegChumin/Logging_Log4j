package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteSample {
    private final static Logger logger = LogManager.getLogger(FileReadWriteSample.class);

    public static void main(String[] args) {
        String filePath = "file.txt";
        String newText = "This is new text to be written to the file.";

        // reading from file.txt
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            logger.error("Error in reading file: " + e.getMessage());
        }
    }
}
