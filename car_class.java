class Car{
    String color;
    String model;
    int year;
    int price;
    int mileage;
    public Car(){}    
    public Car(String color, String model, int year, int price){
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println ("Car color: " + color);
        System.out.println("Car model:" + model);
        System.out.println("Car year:" + year);
        System.out.println("Car price:" + price);

    }
}
class Honda extends Car{
    public Honda(String color, String model, int year, int price){
        super(color, model, year, price);
    }
}
class Toyota extends Car{

}
class Ford extends Car{}
public class car_class{
    public static void main(String[] args){
        Car seltos = new Car("white", "Kia Seltos", 2020, 2000000);
        seltos.displayDetails();
        System.out.println("-----------------");
        Honda HondaCity = new  Honda("red", "Honda City", 2021, 1500000);
        HondaCity.displayDetails();
        System.out.println("-----------------");
        Toyota corolla = new Toyota();
        corolla.color = "black";
        corolla.model = "Toyota Corolla";
        corolla.year = 2022;
        corolla.price = 1800000;
        corolla.displayDetails();
        corolla.mileage = 15;
        System.out.println("Car mileage:" + corolla.mileage);
        

    }
}
