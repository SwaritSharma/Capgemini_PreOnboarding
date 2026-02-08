package Stream;
import java.io.*;

public class PipedExample {
    public static void main(String[] args) throws Exception {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Thread".getBytes());
                pos.close();
            } catch (IOException _) {}
        });

        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1)
                    System.out.print((char) data);
            } catch (IOException _) {}
        });

        writer.start();
        reader.start();
    }
}

