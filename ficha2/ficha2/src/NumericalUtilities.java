public class NumericalUtilities {
    public static int powerOf(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int sumOfNaturalNumbersUpTo(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

    public static float sumOfNaturalNumbersUpToBetween(float first, float last) {
        float result = 0;
        for (float i = first; i <= last; i++) {
            result += i;
        }
        return result;
    }

    public static float sumOfEvenNumbersBetween(float first, float last) {
        float result = 0;
        for (float i = first; i <= last; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static float numberOfDivisorsOf(float number) {
        float divisors = 0;
        for (float i = 1; i <= number; i++) {
            if (i % number == 0) {
                divisors = i;
            }
        }
        return divisors;
    }

    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}


