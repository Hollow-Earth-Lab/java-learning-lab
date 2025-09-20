public class MultiplicationTable_printf {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Multiplication Table:");
        System.out.println();

        System.out.print("   |");
        for (int h = 1; h <=10; h++) {
            System.out.printf("%4d", h);
        }
        System.out.println();
        System.out.println(" -------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("%2d", i);
            System.out.print(" |");

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}