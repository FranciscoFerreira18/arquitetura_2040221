

public abstract class  Shape {
  protected Point position;

  public Shape(){
    this.position = new Point();
  }

  public void setPosition(Point position){
    this.position=position;
  }

  public  Point getPosition(){
      return position;
  }

  public abstract double getArea();

  public abstract double getPerimeter();


}
