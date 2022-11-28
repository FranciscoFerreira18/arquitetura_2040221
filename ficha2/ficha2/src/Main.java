public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int power = NumericalUtilities.powerOf(2,3);
        System.out.println(power);
        int soma = NumericalUtilities.sumOfNaturalNumbersUpTo(5);
        System.out.println(soma);
        float soma1 = NumericalUtilities.sumOfNaturalNumbersUpToBetween(5,7);
        System.out.println(soma1);
        float soma2 = NumericalUtilities.sumOfEvenNumbersBetween(5,8);
        System.out.println(soma2);
        float divisors= NumericalUtilities.numberOfDivisorsOf(4);
        System.out.println(divisors);
       boolean prime= NumericalUtilities.isPrime(751);
        System.out.println(prime);
        int array[] = {1,5,6,3};
        String str = ArrayUtilities.toString(array);
        System.out.println(str);
    }
}

