package Exception;
import java.io.IOException;

public class DataProcessor {

    public void processData(String data) throws IOException {
        if (data == null) {
            throw new IOException("Data is missing"); // checked
        }
        if (data.length() < 3) {
            throw new IllegalArgumentException("Invalid data length"); // unchecked
        }
        System.out.println("Data processed: " + data);
    }
}

