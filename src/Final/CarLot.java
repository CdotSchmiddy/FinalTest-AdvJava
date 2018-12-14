//Calum Schmidtke - 200366773
package Final;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CarLot {
    private TreeMap<String, TreeSet<Car>> menu;

    public CarLot(TreeMap<String, TreeSet<Car>> menu) {
        this.menu = menu;
    }

    //Method for "All Brands" or other key brands
    public Set<String> getBrands() {
        Set<String> carBrands = menu.keySet();
        return carBrands;
    }

    //Method for car objects
    public TreeSet<Car> getCars(Car brand){
        return null;
    }

    //Selling car, minusing car by and price by car price
    public void sellCar(Car car) {
        if (car.getPriceDouble() != 0) {

            double cars = car.getPriceDouble();
            cars--;
            car.setPrice(cars);
        }
    }


    /*public TreeMap<String, TreeSet<Car>> getInventoryValue(String list) {

        return list.stream()
                .sorted()
                .forEach(fruit -> System.out.println(list));

    }*/
}
