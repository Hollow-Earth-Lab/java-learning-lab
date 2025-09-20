public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Multiplication Table:");
        System.out.println();

        System.out.print("   | ");
        for (int h = 1; h <=10; h++) {
            System.out.print(" " + h + "  ");
        }
        System.out.println();
        System.out.println(" ------------------------------------------- ");
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(" " + i + " |  ");
            } else {
                System.out.print(i + " | ");
            }
            for (int j = 1; j <= 10; j++) {
                if ((i * j < 10) && (i * (j + 1) < 10)) {
                    System.out.print((i * j) + "   ");
                } 
                if ((i * j < 10) && (i * (j + 1) >= 10)) {
                    System.out.print((i * j) + "  ");
                }
                if (i * j >= 10) {
                    System.out.print((i * j) + "  ");
                }
                
                if ((j == 9) && (i < 10)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}