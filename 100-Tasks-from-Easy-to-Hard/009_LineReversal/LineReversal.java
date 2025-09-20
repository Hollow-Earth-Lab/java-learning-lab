import java.util.Scanner;

public class LineReversal {

    public static void main(String[] args) {

        String finalLine;

        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        System.out.println("Class LineReversal Loading...");
        System.out.println();
        System.out.print("Enter a string of characters: ");

        String originalLine = scanner.nextLine();

        // System.out.println(originalLine);

        int i = originalLine.length();

        // System.out.println(i);
        // System.out.println();

        //i = i - 1;
        i--;

        while (i >= 0) {
            char symbol = originalLine.charAt(i);
            // System.out.println(symbol);
            builder.append(symbol);
            //i = i - 1;
            i--;
        }

        System.out.println();
        finalLine = builder.toString();
        System.out.println("Reverse string of characters: " + finalLine);
        System.out.println();

        scanner.close();

    }
}