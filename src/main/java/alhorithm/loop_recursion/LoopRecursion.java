package alhorithm.loop_recursion;

/**
 * ЗАДАНИЕ: Квадратные заклинания.
 */
public class LoopRecursion {
    public static void main(String... args) {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 25; y++) {
                System.out.print(
                        (x * y % 3 < 1) ? "# " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


class Page01 {
    public static void main(String... args) {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 25; y++) {
                System.out.print((x < y) ? "# " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Page08 {
    public static void main(String... args) {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 25; y++) {
                System.out.print(
                        (x * y == 0) ? "# " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Page03 {
    public static void main(String... args) {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 25; y++) {
                System.out.print(
                        (x + y == 24) ? "# " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Page04 {
    public static void main(String... args) {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 25; y++) {
                System.out.print(
                        (x + y < 30) ? "# " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}