//Calum Schmidtke - 200366773
package Final;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    CarLot carLot = new CarLot((CarLoader.loadCars()));

    @FXML
    private TableView<Car> inventoryTable;
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
        brandComboBox.setPromptText("Select Brand");
        brandComboBox.getItems().addAll(carLot.getBrands());

        yearColumn.setCellValueFactory(new PropertyValueFactory<Car, Integer>("year"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("brand"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("model"));
        kmColumn.setCellValueFactory(new PropertyValueFactory<Car, Integer>("kilometer"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Car, Double>("price"));

        loadInventory();
    }

    public void loadInventory() {
        ObservableList<Car> cars = FXCollections.observableArrayList();

        inventoryTable.getItems().addAll(cars);
    }
}
