import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

    public class DbFX {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnClient;

        @FXML
        private Button btnServiceUser;

        @FXML
        private PasswordField edtPassword;

        @FXML
        private TextField edtUser;

        @FXML
        void edtClientID(ActionEvent event) {

        }

        @FXML
        void edtPassword(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnClient != null : "fx:id=\"btnClient\" was not injected: check your FXML file 'dbFX.fxml'.";
            assert btnServiceUser != null : "fx:id=\"btnServiceUser\" was not injected: check your FXML file 'dbFX.fxml'.";
            assert edtPassword != null : "fx:id=\"edtPassword\" was not injected: check your FXML file 'dbFX.fxml'.";
            assert edtUser != null : "fx:id=\"edtUser\" was not injected: check your FXML file 'dbFX.fxml'.";

        }

    }

