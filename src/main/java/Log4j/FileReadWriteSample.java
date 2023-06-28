package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class FileReadWriteSample {
    private final static Logger logger = LogManager.getLogger(FileReadWriteSample.class);

    public static void main(String[] args) {
        String filePath = "src/main/resources/file.txt";
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

        //writing new data
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
