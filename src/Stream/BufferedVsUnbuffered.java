package Stream;

import java.io.*;

public class BufferedVsUnbuffered {
    static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[4096];
        int bytes;
        while ((bytes = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytes);
        }
        os.flush();
    }

    public static void main(String[] args) throws Exception {
        long start, end;

        start = System.nanoTime();
        copy(new FileInputStream("resources/bigfile.dat"),
                new FileOutputStream("normalCopy.dat"));
        end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start));

        start = System.nanoTime();
        copy(new BufferedInputStream(new FileInputStream("resources/bigfile.dat")),
                new BufferedOutputStream(new FileOutputStream("bufferedCopy.dat")));
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }
}
