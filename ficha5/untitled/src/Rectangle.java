public class Rectangle {
   Point topLeftPoint;
   private double heigth;
    private double width;

    public Rectangle(){
        topLeftPoint = new Point();
        heigth = 0;
        width = 0;
    }
    public Rectangle(Point topLeftPoint, double heigth, double width ){
        this.topLeftPoint = topLeftPoint;
        this.heigth = heigth;
        this.width = width;
    }

    public Point getTopLeftPoint(){
        return getTopLeftPoint();
    }
    public double getHeigth(){
        return heigth;
    }
    public double getWidth(){
        return width;
    }

    public void setTopLeftPoint(Point topLeftPoint){
        this.topLeftPoint=topLeftPoint;
    }
    public void setHeigth(double heigth){
        this.heigth=heigth;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double area(){
        return width*heigth;
    }
    public double perimetro(){
        return (width+heigth) * 2;
    }

    public boolean contain(Point p){
        Point bottomLeftPoint=new Point((topLeftPoint.getX()),(topLeftPoint.getY()- heigth));
        Point bottomRightPoint=new Point((bottomLeftPoint.getX()+width),(bottomLeftPoint.getY()));
        Point topRightPoint=new Point((bottomRightPoint.getX()),(topLeftPoint.getY()));
        boolean contain=false;
        if(p.getX()> topLeftPoint.getX() && p.getX() < topRightPoint.getX() && p.getY()> bottomLeftPoint.getY() && p.getY()<topRightPoint.getY()){
            contain=true;

        }
        return contain;
    }
}


