import java.awt.event.ActionEvent;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import ib.AdminDAO;
import ib.DBUtil;
import ib.Reclamation;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DbFXServer {
    public DBUtil dbAccess;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnFilter;

    @FXML
    private Button btnLogOutAdmin;

    @FXML
    private Button btnShowStats;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> client;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private DatePicker dateFilterFrom;

    @FXML
    private DatePicker dateFilterTo;

    @FXML
    private TableColumn<?, ?> deviceId;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private ImageView imAdminImg;

    @FXML
    private SplitMenuButton listFilterStatus;

    @FXML
    private SplitMenuButton listStatusUpdate;

    @FXML
    private TableColumn<?, ?> price;

    @FXML
    private TableColumn<?, ?> status;

    @FXML
    private TableView<?> tableViewDataAdmin;

    @FXML
    private TextField tfIdUpdate;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {
        assert btnFilter != null : "fx:id=\"btnFilter\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert btnLogOutAdmin != null : "fx:id=\"btnLogOutAdmin\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert btnShowStats != null : "fx:id=\"btnShowStats\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert btnUpdate != null : "fx:id=\"btnUpdate\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert client != null : "fx:id=\"client\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert dateFilterFrom != null : "fx:id=\"dateFilterFrom\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert dateFilterTo != null : "fx:id=\"dateFilterTo\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert deviceId != null : "fx:id=\"deviceId\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert imAdminImg != null : "fx:id=\"imAdminImg\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert listFilterStatus != null : "fx:id=\"listFilterStatus\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert listStatusUpdate != null : "fx:id=\"listStatusUpdate\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert tableViewDataAdmin != null : "fx:id=\"tableViewDataAdmin\" was not injected: check your FXML file 'dbFXServer.fxml'.";
        assert tfIdUpdate != null : "fx:id=\"tfIdUpdate\" was not injected: check your FXML file 'dbFXServer.fxml'.";

        dbAccess = new DBUtil("root", "Magicalnature2");
        DBUtil dbAccess = new DBUtil("root", "Magicalnature2");
        try {
            dbAccess.dbConnect();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void LogoutClicked(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) btnLogOutAdmin.getScene().getWindow();
        stage.close();
    }
    private AdminDAO adminDAO;

    public void ShowDataClicked(javafx.event.ActionEvent actionEvent) {

        try {

            tableViewDataAdmin.getItems().clear();
            ObservableList<> reclamationsData = adminDAO.showAllReclamations();
            populateTable(reclamationsData);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void populateTable(ObservableList<Reclamation> reclamationsData) {
        tableViewDataAdmin.setItems(reclamationsData);
    }

    public void ShowStatusClicked(javafx.event.ActionEvent actionEvent) {
    }

    public void UpdateClicked(javafx.event.ActionEvent actionEvent) {
    }
}

