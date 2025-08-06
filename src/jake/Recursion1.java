package jake;

public class Recursion1 {


    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        return 2 + bunnyEars(bunnies -1 );
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        if (bunnies % 2 != 0) {
            return 2 + bunnyEars2(bunnies - 1);
        } else {
            return 3 + bunnyEars2(bunnies - 1);
        }

    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }

        if (rows == 1) {
            return 1;
        }

        return triangle(rows - 1) + rows;
    }


}
