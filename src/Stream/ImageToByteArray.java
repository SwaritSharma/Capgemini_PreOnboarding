package Stream;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("resources/image.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytes;
        while ((bytes = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytes);
        }

        byte[] imageBytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        while ((bytes = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytes);
        }

        fis.close();
        fos.close();
        System.out.println("Image copied successfully.");
    }
}
