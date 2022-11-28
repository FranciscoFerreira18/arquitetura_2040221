import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car c2 = new Car("Ford", "Focus", 20000, "Blue", 4, 1997);
        Motorcycle m1 = new Motorcycle("KTM", "530", 3000, "Black", 2003, 2);
       // System.out.println(c2.toString());
        // System.out.println(m1.toString());
        c2.drive();
        m1.drive();

        ArrayList<Point> arrayList = new ArrayList<Point>();
        arrayList.add(new Point());
        arrayList.add(new Point(10,10));
        arrayList.add(new Point(50,5));
        arrayList.add(new Point(2,4));


        //Collections.sort(arrayList);
        Collections.sort(arrayList,new PointComparator());
        System.out.println(arrayList.toString());

        Figure figure = new Figure();
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3));
        Rectangle rt = new Rectangle(new Point(0, 0), 5, 10);

        figure.add(tr);
        figure.add(rt);

       Point px = new Point(3,4);
        //System.out.println(px);

        for (Shape shape: figure.getShapes()
        ) {
            double area= shape.getArea();
            double perimetro= shape.getPerimeter();
            //System.out.println(shape.toString());
            //System.out.println("\t Area: " + area + " Perimetro: " + perimetro);

        }
    }
}