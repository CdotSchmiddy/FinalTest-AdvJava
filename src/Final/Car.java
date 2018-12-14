//Calum Schmidtke - 200366773
package Final;

import java.time.Year;

public class Car implements Comparable{

    private int year;
    private String brand;
    private String model;
    private int kilometer;
    private double price;

    //Car constructor
    public Car(int year, String brand, String model, int kilometer, double price) {
        setYear(year);
        setBrand(brand);
        setModel(model);
        setKilometer(kilometer);
        setPrice(price);
    }

    //Get method for the year variable
    public int getYear() {
        return year;
    }

    //Set method for the year variable, validates year is between 1902 and the current date + 1 year
    public void setYear(int year) {
        if (year >= 1902 && year <= Year.now().getValue() + 1)
            this.year = year;
        else
            throw new IllegalArgumentException("Year must be between 1902-Current Date + 1 year");
    }

    //Get method for the brand variable
    public String getBrand() {
        return brand;
    }

    //Set method for the brand variable, validates brand name is between 0-30 characters and is not empty
    public void setBrand(String brand) {
        if (!brand.isEmpty() && brand.length() <30)
            this.brand = brand;
        throw new IllegalArgumentException("Brand name must be 0-30 characters");
    }

    //Get method for the model variable
    public String getModel() {
        return model;
    }

    //Set method for the model variable, validates model name is between 0-30 characters and is not empty
    public void setModel(String model) {
        if (!model.isEmpty() && model.length() <30)
            this.model = model;
        throw new IllegalArgumentException("Model name must be 0-30 characters");
    }

    //Get method for the kilometer variable
    public int getKilometer() {
        return kilometer;
    }

    //Set method for the kilometer variable, validates kilometers is greater than or equal to 0
    public void setKilometer(int kilometer) {
        if (kilometer>=0)
            this.kilometer = kilometer;
        else
            throw new IllegalArgumentException("Kilometers must be greater than or equal to 0");
    }

    //Get method for the price variable converted to String
    public String getPrice() {
        return null;
    }

    //Get method for the year variable as a regular double
    public double getPriceDouble(){
        return price;
    }

    //Set method for the price variable, validates price is greater than or equal to 0
    public void setPrice(double price) {
        if (price>=0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be greater than or equal to 0");
    }
    //Compare method to compare model name and kilometers
    @Override
    public int compareTo(Object Car) {
        return 0;
    }
}
