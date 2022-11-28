public class ArrayUtilities {
    public static String toString (int[]array){
        String str = "[";
        for (int i = 0; i < array.length; i ++){
            if(i < array.length -1){
                str += array[i] + ", ";
            }
            else {
                str += array[i];
            }
        }
        return str + " ]";
    }
    public static int[] copyOF(int[] array){
        int [] copy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

}
