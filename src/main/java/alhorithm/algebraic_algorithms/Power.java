package alhorithm.algebraic_algorithms;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Slf4j
public class Power {
    public static void main(String... args) {
        int numberPower = getNumberPower(3, 3);
        log.info("numberPower = " + numberPower);
    }

    /**
     * Возведение в степень.
     *
     * @param value
     * @param valuePow
     * @return
     */
    public static int getNumberPower(int value, int valuePow) {
        int result = 1;
        for (int i = 1; i <= valuePow; i++) {
            result = result * value;
        }
        return result;
    }
}

@Slf4j
class PowerRecursive {
    public static void main(String... args) {
        int numberPowerRecursive = getNumberPowerRecursive(3, 2);
        log.info("numberPowerRecursive = " + numberPowerRecursive);
    }

    /**
     * Возведение в степень рекурсия.
     *
     * @param value
     * @param valuePow
     * @return
     */
    public static int getNumberPowerRecursive(int value, int valuePow) {
        if (valuePow == 1) {
            return value;
        } else {
            return value * getNumberPowerRecursive(value, valuePow - 1);
        }
    }
}

@Slf4j
class Fibonacci {
    public static void main(String... args) {
        int numberFibonacci = getNumberFibonacci(10);
        log.info("numberFibonacci: " + numberFibonacci);
    }

    public static int getNumberFibonacci(int value) {
        if (value == 0 || value == 1) {
            return value;
        }
        int valueOne = 0;
        int valueTwo = 1;
        int temp;
        for (int i = 2; i <= value; i++) {
            temp = valueOne + valueTwo;
            valueOne = valueTwo;
            valueTwo = temp;
        }
        return valueTwo;
    }
}


@Slf4j
class SearchSimpleNumber {
    public static void main(String... args) {

    }

    public static int getSearchPrimeNumber(int value) {

        return 0;
    }

}

@Slf4j
class Random {
    public static void main(String... args) {
        RandomGenerators randomGenerators = new RandomGenerators(257, 51, 128, 1);
        for (int i = 0; i < 100; i++) {
            log.info("generate numbers: " + randomGenerators.get());
        }
    }

    @AllArgsConstructor
    @FieldNameConstants
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class RandomGenerators {
        int a;
        int c;
        int m;
        int xlast;

        int get() {
            xlast = (a * xlast + c) % m;
            return Math.abs(xlast);
        }
    }

}

class Eratosfen {
    public static void main(String... args) {
        System.out.println(Arrays.toString(eratosfenPrimes(1000).toArray()));
    }

    private static List<Integer> eratosfenPrimes(int max) {
        boolean[] isPrimes = new boolean[max];
        Arrays.fill(isPrimes, true);

        for (int i = 2; i * i < max; i++) {
            if (isPrimes[i]) {
                for (int j = 2 * i; j < max; j += i) {
                    isPrimes[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if (isPrimes[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}

@Slf4j
class PrimeTest {
    public static void main(String... args) {
        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                log.info("number is prime: " + i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}