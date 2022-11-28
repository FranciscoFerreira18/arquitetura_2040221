import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array= new int[3];
        array[0]= 19;
        array[1]= 15;
        array[2]= 9;
        System.out.println(Arrays.toString(array));
        testArray(array);
        System.out.println(Arrays.toString(array));
        int number = 3;
        System.out.println(number);
        increment(number);
        System.out.println(number);
    }

    private static void testArray(int[] array) {
        array[0]=66;
    }

    public static void increment(int value) {
        value++;
    }
}


