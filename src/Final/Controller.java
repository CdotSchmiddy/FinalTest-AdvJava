//Calum Schmidtke - 200366773
package Final;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    CarLot carLot = new CarLot((CarLoader.loadCars()));

    @FXML
    private TableView<Car> volunteerTable;
    @FXML
    private TableColumn<Car, Integer> yearColumn;
    @FXML
    private TableColumn<Car, String> brandColumn;
    @FXML
    private TableColumn<Car, String> modelColumn;
    @FXML
    private TableColumn<Car, Integer> kmColumn;
    @FXML
    private TableColumn<Car, Double> priceColumn;

    @FXML
    private ComboBox brandComboBox;
    @FXML
    private Button sellButton;
    @FXML
    private Label inventoryLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        brandComboBox.setPromptText("Select a Genre");
        brandComboBox.getItems().addAll(carLot.getBrands());
    }
}
