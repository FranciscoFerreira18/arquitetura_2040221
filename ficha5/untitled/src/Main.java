public class Main {
    public static void main(String[] args) {
        Point p0 = new Point(1, 1);
        Point p1 = new Point();
        Point p2 = new Point(3, 1);

        Triangle tr = new Triangle(new Point(), new Point(3,0),new Point(0,3));

        //System.out.println("Base: " + tr.comprimento());
        //System.out.println("Altura: " + tr.altura());
        //System.out.println("Area: "+ tr.area());

        Rectangle rec= new Rectangle(new Point(0,3),3,5);

        System.out.println("Area: "+ rec.area());
        System.out.println("Perimetro: "+ rec.perimetro());

        Point p = new Point(6,7);

        boolean contains = rec.contain(p);
        System.out.println(contains);
    }



}

