package home_task_17_10_23.task_2;

public class Main {
    public static void main(String[] args) {
        ProperFraction fraction1 = new ProperFraction(1, 2);
        ProperFraction fraction2 = new ProperFraction(2, 4);
        ProperFraction fraction3 = new ProperFraction(24, 32);
        ProperFraction fraction4 = new ProperFraction(8, 16);

        System.out.println("Дробь 1: " + fraction1);
        System.out.println("Дробь 2: " + fraction2);
        System.out.println("Дробь 3: " + fraction3);
        System.out.println("Дробь 4: " + fraction4);

        System.out.println("fraction1.equals(fraction2): " + fraction1.equals(fraction2));
        System.out.println("fraction1.equals(fraction3): " + fraction1.equals(fraction3));
    }
}
