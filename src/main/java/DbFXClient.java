import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DbFXClient {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAddRecl;

    @FXML
    private Button btnLogOut;

    @FXML
    private Button btnShowAll;

    @FXML
    private TableView<?> table;

    @FXML
    private DatePicker tfBoughtDate;

    @FXML
    private TextField tfClientID;

    @FXML
    private TextField tfDeviceName;

    @FXML
    private TextField tfSerialNo;

    @FXML
    void LogOutClicked(ActionEvent event) {

    }

    @FXML
    void ShowAllClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAddRecl != null : "fx:id=\"btnAddRecl\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert btnLogOut != null : "fx:id=\"btnLogOut\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert btnShowAll != null : "fx:id=\"btnShowAll\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfBoughtDate != null : "fx:id=\"tfBoughtDate\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfClientID != null : "fx:id=\"tfClientID\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfDeviceName != null : "fx:id=\"tfDeviceName\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfSerialNo != null : "fx:id=\"tfSerialNo\" was not injected: check your FXML file 'dbFXClient.fxml'.";

    }

}
