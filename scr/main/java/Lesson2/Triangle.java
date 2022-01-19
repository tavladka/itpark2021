package Lesson2;

public class Triangle {
    private static long perimeter(int arg1, int arg2, int arg3) {
        return arg1 + arg2 + arg3;
    }

    public static long square(int arg1, int arg2, int arg3) {
        long p = (arg1 + arg2 + arg3) / 2L;
        return (long) Math.sqrt(p * (p - arg1) * (p - arg2) * (p - arg3));
    }

    public static void main(String[] args) {
        long result1 = perimeter(3, 4, 5);
        System.out.println("Периметр треугольника со сторонами 3, 4 и 5 равен " + result1);
        long result2 = square(3, 4, 5);
        System.out.println("Площадь треугольника со сторонами 3, 4 и 5 равна " + result2);
    }
}

