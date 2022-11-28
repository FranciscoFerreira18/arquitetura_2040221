public class Car extends Vehicle {

    private int doors;

    public Car(){
        super();
        this.doors = 0;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    public Car(String Brand, String Model, double price, String color, int doors,int year) {
        super(Brand, Model, price, color,year);
        this.doors = doors;
    }

    @Override
    public String toString(){
        return super.toString() + ",Doors: "+ this.doors;
    }
}
