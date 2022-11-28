public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float x = perimetro(1,2);
        System.out.println(x);
        float v = volume(3,3,3);
        System.out.println(v);
        float t = temperatura(50);
        System.out.println(t);
        float total = transformar(1,30,20);
        System.out.println(total);
        int[] values = {7,2,3,0,1};
        int max = maximum(values);
        System.out.println(max);
        int min = minimum(values);
        System.out.println(min);
        float avg = averege(values);
        System.out.println(avg);
    }



    public static float perimetro(float comprimento, float altura){
        return comprimento*2 + altura*2;

    }
    public static float volume(float width, float higth, float depth){
        return width*higth*depth;
    }

    public static float temperatura(float farenheit){
        return (farenheit-32)*5/9;
    }

    public static int transformar(int hours, int minutes, int seconds){
        int h = hours*3600;
        int m = minutes*60;
        return h+m+seconds;
    }
    public static int maximum(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length;i++){
            if (values[i]>max){
                max = values[i];
            }
        }
        return max;
    }
    public static int minimum(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length;i++){
            if (values[i]<min){
                min = values[i];
            }
        }
        return min;
    }
    public static float averege(int[] values) {
        float total = 0;
        float averege;
        for (int i = 0;i<values.length;i++){
            total+= values[i];
        }
        averege=total/ values.length;
        return averege;
    }


}



