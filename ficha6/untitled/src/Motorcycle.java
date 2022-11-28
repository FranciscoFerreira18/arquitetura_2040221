public class Motorcycle extends Vehicle {
    private int rodas;

    public Motorcycle(int rodas) {
        super();
        this.rodas = rodas;
    }

    public Motorcycle(String Brand, String Model, double price, String color, int year, int rodas) {
        super(Brand, Model, price, color, year);
        this.rodas = rodas;
    }

    @Override
    public void drive() {
        System.out.println("Driving a Motorcycle");
    }

    @Override
    public String toString(){
        return super.toString() + "Rodas: " + this.rodas;
    }
}
