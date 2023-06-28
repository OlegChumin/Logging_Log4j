package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadWriteSample {
    private final static Logger logger = LogManager.getLogger(FileReadWriteSample.class);

    public static void main(String[] args) {
        String filePath = "";
        String newText = "This is new text to be written to the file.";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
