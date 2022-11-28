public class Triangle extends Shape{

    private Point b;
    private Point c;

    public Triangle(){
        position = new Point();
        b= new Point();
        c = new Point();
    }

    @Override
    public double getArea() {
        return comprimento()*altura()/2;
    }

    @Override
    public double getPerimeter() {
        double hipo = c.distanceTo(b);
        double perimeter = hipo + comprimento() + altura();
        return perimeter;
    }

    public Triangle(Point a, Point b, Point c){
        this.position=a;
        this.b=b;
        this.c=c;
    }

    //seletor
    public Point getA(){
        return position;
    }
    public Point getB(){
        return b;
    }
    public Point getC(){
        return c;
    }

    //modificador
    public void setA(Point a){
        this.position=a;
    }
    public void setB(Point b){
        this.b=b;
    }
    public void setC(Point c){
        this.c=c;
    }

    public void setABC(Point newA, Point newB, Point newC){
        position = newA;
        b = newB;
        c = newC;
    }

    public double comprimento(){
        return position.distanceTo(b);

    }

    public double altura(){
        return position.distanceTo(c);
    }

    @Override
    public String toString() {
        return getClass().getName()+" A: " + this.position.toString()+
                "B: " + this.b.toString()+
                "C: "+ this.c.toString();

    }
}

