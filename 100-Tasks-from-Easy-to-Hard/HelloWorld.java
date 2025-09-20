import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        out.println("Привет, мир!");
    }
}
