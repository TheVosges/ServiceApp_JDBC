package ib;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAO {

    private DBUtil dbUtil;

    public ClientDAO(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    private ObservableList<ReclamationStatus> getReclamationList(ResultSet resultSet) throws SQLException {

        ObservableList<ReclamationStatus> reclamations = FXCollections.observableArrayList();

        while (resultSet.next()) {
            ReclamationStatus status = new ReclamationStatus();
            status.setClientID(resultSet.getInt("client_id"));
            status.setDeviceName(resultSet.getString("device_name"));
            status.setSerialNo(resultSet.getString("serial_no"));
            status.setPrice(resultSet.getDouble("price"));
            status.setReclamationStatus(resultSet.getString("reclamation_status"));
            reclamations.add(status);
        }
        return reclamations;
    }


    public ObservableList<ReclamationStatus> showReclamations(String id) throws SQLException, ClassNotFoundException {

        String selectClient = "SELECT * FROM reclamation_status_view WHERE client_id = " + id;

        try {
            ResultSet resultSet = dbUtil.dbExecuteQuery(selectClient);
            ObservableList<ReclamationStatus> reclamationStatus = getReclamationList(resultSet);
            return reclamationStatus;
        } catch (SQLException e) {
            throw e;
        }
    }


}
