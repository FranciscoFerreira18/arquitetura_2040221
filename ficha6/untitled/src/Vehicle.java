import java.awt.*;

public abstract class Vehicle {
    private int year;
    private String Brand;
    private String Model;
    private double price;
    private String color;

    public Vehicle(){
        year = 0;
        Brand = "";
        Model = "";
        price = 0;
        color = "";
    }

    public Vehicle(String Brand, String Model, double price, String color,int year){
        this.Brand= Brand;
        this.Model = Model;
        this.price = price;
        this.color = color;
        this.year=year;
    }

    public int getYear(){
        return year;
    }
    public String getBrand(){
        return Brand;
    }
    public String getModel(){
        return Model;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return
                "year:" + year +
                ", Brand:'" + Brand + '\'' +
                ", Model:'" + Model + '\'' +
                ", price:" + price +  '\'' +
                ", color:'" + color + '\'';
    }
}
