import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Teste {

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }

    }
}