package ib;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
    private DBUtil dbUtil;

    public AdminDAO(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    private ObservableList<Reclamation> getPlayerList(ResultSet rs) throws SQLException {

        ObservableList<Reclamation> reclamationsList = FXCollections.observableArrayList();

        while (rs.next()) {

            Reclamation r = new Reclamation();
            r.setId(rs.getInt("id"));
            r.setPrice(rs.getDouble("price"));
            r.setDate(rs.getString("date"));
            r.setClientID(rs.getInt("clientID"));
            r.setDeviceID(rs.getString("deviceID"));
            r.setStatus(rs.getString("status"));
            reclamationsList.add(r);
        }


        return reclamationsList;
    }


    public ObservableList<Reclamation> showAllReclamations() throws SQLException, ClassNotFoundException {

        String selectStmt = "SELECT * FROM reclamations;";

        try {

            ResultSet resultSet = dbUtil.dbExecuteQuery(selectStmt);

            ObservableList<Reclamation> players = getPlayerList(resultSet);

            return players;


        } catch (SQLException e) {
            throw e;
        }

    }





}

