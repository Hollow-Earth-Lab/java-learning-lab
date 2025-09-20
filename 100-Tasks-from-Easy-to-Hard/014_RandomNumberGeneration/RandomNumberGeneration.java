public class RandomNumberGeneration {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Генерируем случайное число типа double от 0.0 (включительно) до 1.0 (исключительно):");
        double random = Math.random();
        System.out.println(random); // например: 0.548813

        System.out.println();
        System.out.println("Генерируем случайное целое число от 0 до 9:");
        int randomInt = (int) (Math.random() * 10);
        System.out.println(randomInt); // например: 7

        System.out.println();
        System.out.println("Генерируем случайное число в диапазоне [min, max]");
        int min = 0;
        System.out.println("min = " + min);
        int max = 100;
        System.out.println("max = " + max);
        int randomInRange = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomInRange); // например: 15

        System.out.println();
        System.out.println("Бросок кубика (1-6):");
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println(diceRoll);

        System.out.println();
        System.out.println("Случайный boolean:");
        boolean randomBoolean = Math.random() < 0.5;
        System.out.println(randomBoolean);

        System.out.println();
        System.out.println("Случайный символ от 'a' до 'z':");
        char randomChar = (char) ('a' + Math.random() * 26);
        System.out.println(randomChar);

        System.out.println();
        long raw = Math.round(Integer.MAX_VALUE * Math.random());
        int randomPositiveInteger = (int) raw;
        System.out.println("Случайный положительный Integer (от 0 до " + (Integer.MAX_VALUE) + "):");
        System.out.println(randomPositiveInteger);

    }
}
