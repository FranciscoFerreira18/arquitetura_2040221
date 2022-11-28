public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        a = new Point();
        b= new Point();
        c = new Point();
    }
    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    //seletor
    public Point getA(){
        return a;
    }
    public Point getB(){
        return b;
    }
    public Point getC(){
        return c;
    }

    //modificador
    public void setA(Point a){
        this.a=a;
    }
    public void setB(Point b){
        this.b=b;
    }
    public void setC(Point c){
        this.c=c;
    }

    public void setABC(Point newA, Point newB, Point newC){
        a = newA;
        b = newB;
        c = newC;
    }

    public double comprimento(){
        return a.distanceTo(b);

    }

    public double altura(){
        return a.distanceTo(c);
    }

    public double area(){
        return (comprimento()*altura()/2);
    }




}
