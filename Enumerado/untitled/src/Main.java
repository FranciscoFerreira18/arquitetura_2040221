import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       ArrayList<Point> arraylist = new ArrayList<>();

       Point p1 = new Point();

       arraylist.add(new Point());
        arraylist.add(new Point(10,10));
        arraylist.add(new Point(5,5));
        arraylist.add(new Point(9,7));

        Point element = arraylist.get(2);

        arraylist.remove(new Point());

        for (int i = 0; i < arraylist.size(); i ++){
            System.out.println(arraylist.get(i));
        }

        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        String str = stack.pop();

        HashMap<String, Point> map = new HashMap<String, Point>();

        map.put("Point 1", new Point());
        map.put("Point 2", new Point(10,10));

        Point pm = map.get("Point 2");



    }
}