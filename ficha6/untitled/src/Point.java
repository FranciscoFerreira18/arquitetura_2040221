
    public class Point implements Comparable<Point> {
        private double x;
        private double y;
        public Point( double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point(){
            x = 0.0;
            y = 0.0;
        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
        public void setX(double x){
            this.x = x;

        }
        public void setY(double y){
            this.y = y;
        }
        public void setxy(double newvalueX, double newvalueY){
            x = newvalueX;
            y = newvalueY;
        }

        public double distanceTo(Point other) {
            double distance = 0;

            distance = Math.sqrt(Math.pow(other.x-this.x,2) + Math.pow(other.y-this.y,2));

            return distance;
        }

        @Override
        public String toString() {
            return getClass().getName()+  " Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public int compareTo(Point o) {
            // crescente first this / descrescente firts var
            int diff = (int) ((this.x - o.x) + (this.y-o.y));
            return diff;
        }
    }


