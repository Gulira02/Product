import java.time.LocalDate;

public class Car {
    private String make;
    private int yearOfManufacture;
    private double price;
    private BodyType bodyType;


    public Car(int make, int yearOfManufacture, double price, Enum bodyType) {
        this.make = String.valueOf(make);
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.bodyType = (BodyType) bodyType;
    }

    public String getMake() {
        return make;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }




    public Object bodyTypeIdentification() {

        switch (bodyType) {
            case SEDAN:
                return "sedan";
            case HATCHBACK:
                return "Passenger class car";
            case CROSSOVER:
            case SUV:
                return "SUV class car";
            case STATION_WAGON:
                return "Station wagon class car";
            default:
                return "Unknown body type";
        }


    //determinationoYearOfManufacture методу, азыркы жыл LocalDate now getYear
}
public int  determinationoYearOfManufacture(){
    LocalDate now = LocalDate.now();
    return now.getYear() - yearOfManufacture;
}



}
