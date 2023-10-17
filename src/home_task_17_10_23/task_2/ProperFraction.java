package home_task_17_10_23.task_2;

import java.util.Objects;

// Создайте класс правильной дроби (например, 1/2, 7/8 и т.д.).
// Числитель и знаменатель будут храниться в отдельных полях типа int.
// Самостоятельно (без генерации в IDE) реализуйте методы equals и hashCode для класса.
// Причём дроби с одинаковым результатом необходимо считать эквивалентными, т.е. 1/2 эквивалентна 2/4,
// эквивалентна 5/10 и т.д.
public class ProperFraction {
    private int numerator;// Числитель
    private int denominator;// Знаменатель

    public ProperFraction(int numerator, int denominator){
        if (denominator == 0){
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProperFraction that = (ProperFraction) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

//     алгоритм Евклида - способ вычисления GCD двух чисел
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
