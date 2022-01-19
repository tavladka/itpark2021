package Lesson2;

public class Result {
    private static long perimeter(int arg1, int arg2) {
        return arg1 * 2L + arg2 * 2L;
    }

    public static long square(int arg1, int arg2) {
        return (long) arg1 * arg2;
    }

    public static void main(String[] args) {
        long result1 = perimeter(4, 8);
        System.out.println("Периметр прямоугольника со сторонами 4 и 8 равен " + result1);
        long result2 = square(4, 8);
        System.out.println("Площадь прямоугольника со сторонами 4 и 8 равна " + result2);
    }
}

