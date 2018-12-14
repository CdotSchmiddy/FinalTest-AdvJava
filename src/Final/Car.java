//Calum Schmidtke - 200366773
package Final;

import java.time.Year;

public class Car implements Comparable{

    private int year;
    private String brand;
    private String model;
    private int kilometer;
    private double price;

    public Car(int year, String brand, String model, int kilometer, double price) {
        setYear(year);
        setBrand(brand);
        setModel(model);
        setKilometer(kilometer);
        setPrice(price);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1902 && year <= Year.now().getValue() + 1)
            this.year = year;
        else
            throw new IllegalArgumentException("Year must be between 1902-Current Date + 1 year");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!brand.isEmpty() && brand.length() <30)
            this.brand = brand;
        throw new IllegalArgumentException("Brand name must be 0-30 characters");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty() && model.length() <30)
            this.model = model;
        throw new IllegalArgumentException("Model name must be 0-30 characters");
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        if (kilometer>=0)
            this.kilometer = kilometer;
        else
            throw new IllegalArgumentException("Kilometers must be greater than or equal to 0");
    }

    public String getPrice() {
        return null;
    }

    public double getPriceDouble(){
        return price;
    }

    public void setPrice(double price) {
        if (price>=0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be greater than or equal to 0");
    }

    @Override
    public int compareTo(Object Car) {
        return 0;
    }
}
