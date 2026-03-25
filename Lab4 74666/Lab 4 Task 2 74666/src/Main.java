 class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String m, String b, int y, double p, String c, int q){
        model = m;
        brand = b;
        year = y;
        price = p;
        color = c;
        quantity = q;
    }

    public String getModel(){ return model; }
    public String getBrand(){ return brand; }
    public int getYear(){ return year; }
    public double getPrice(){ return price; }
    public String getColor(){ return color; }
    public int getQuantity(){ return quantity; }

    public void setModel(String m){ model = m; }
    public void setBrand(String b){ brand = b; }
    public void setYear(int y){ year = y; }
    public void setPrice(double p){ price = p; }
    public void setColor(String c){ color = c; }
    public void setQuantity(int q){ quantity = q; }


    public void sell(int n){
        if(n <= quantity) quantity = quantity - n;
    }

    public void delivery(int n){ quantity = quantity + n; }

    public String toString(){
        return "model=" + model + ", brand=" + brand + ", year=" + year + ", price=" + price + ", color=" + color + ", quantity=" + quantity;
    }
}

public class Main{
    public static void main(String[] args){
        Car c = new Car("Model 128 Nasr","Fiat",1970,3000,"Red",67);
        System.out.println(c.toString());
        c.sell(2);
        System.out.println("Quantity now: " + c.getQuantity());
        c.setColor("Blue");
        c.setPrice(88000);
        c.delivery(3);
        System.out.println(c.toString());
    }
}