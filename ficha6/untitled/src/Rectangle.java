
    public class Rectangle extends Shape{

        private double heigth;
        private double width;

        public Rectangle(){
            position = new Point();
            heigth = 0;
            width = 0;
        }

        @Override
        public double getArea() {
            return width*heigth;
        }

        @Override
        public double getPerimeter() {
            return (width+heigth) * 2;
        }

        public Rectangle(Point position, double heigth, double width ){

            this.position = position;
            this.heigth = heigth;
            this.width = width;
        }

        public Point getTopLeftPoint(){
            return position;
        }
        public double getHeigth(){
            return heigth;
        }
        public double getWidth(){
            return width;
        }

        public void setTopLeftPoint(Point topLeftPoint){
            this.position=topLeftPoint;
        }
        public void setHeigth(double heigth){
            this.heigth=heigth;
        }
        public void setWidth(double width){
            this.width=width;
        }



        public boolean contain(Point p){
            Point bottomLeftPoint=new Point((position.getX()),(position.getY()- heigth));
            Point bottomRightPoint=new Point((bottomLeftPoint.getX()+width),(bottomLeftPoint.getY()));
            Point topRightPoint=new Point((bottomRightPoint.getX()),(position.getY()));
            boolean contain=false;
            if(p.getX()> position.getX() && p.getX() < topRightPoint.getX() && p.getY()> bottomLeftPoint.getY() && p.getY()<topRightPoint.getY()){
                contain=true;

            }
            return contain;
        }

        @Override
        public String toString() {
            return getClass().getName()+" TopLeftPoint: "+ this.position.toString()+
                    "Altura: "+ this.heigth +
                    "Comprimento: "+ this.width;
        }
    }

