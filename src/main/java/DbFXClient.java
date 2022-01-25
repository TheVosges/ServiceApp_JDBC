
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DbFXClient {
    private String clientID;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnLogOut;

    @FXML
    private Button btnShowAll;

    @FXML
    private DatePicker dpBoughtDate;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField tfClientID;

    @FXML
    private TextField tfDeviceName;

    @FXML
    private TextField tfSerialNo;

    @FXML
    void AddCliked(ActionEvent event) {

    }

    public void transferMessage(String message) {
        //Display the message
        this.clientID = message;
        tfClientID.setText(clientID);
    }

    @FXML
    void LogOutClicked(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnLogOut.getScene().getWindow();
        stage.close();
    }

    @FXML
    void ShowAllCliked(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert btnLogOut != null : "fx:id=\"btnLogOut\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert btnShowAll != null : "fx:id=\"btnShowAll\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert dpBoughtDate != null : "fx:id=\"dpBoughtDate\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfClientID != null : "fx:id=\"tfClientID\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfDeviceName != null : "fx:id=\"tfDeviceName\" was not injected: check your FXML file 'dbFXClient.fxml'.";
        assert tfSerialNo != null : "fx:id=\"tfSerialNo\" was not injected: check your FXML file 'dbFXClient.fxml'.";

    }

}
