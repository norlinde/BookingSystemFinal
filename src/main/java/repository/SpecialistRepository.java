package repository;

import database.DBHandler;
import entity.Specialist;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SpecialistRepository {
    private DBHandler dbHandler = new DBHandler();

    public ArrayList<Specialist> getAll() throws SQLException {
        Statement statement = dbHandler.getConnection().createStatement();
        String query = "SELECT * FROM Specialist";
        ResultSet results = statement.executeQuery(query);

        ArrayList<Specialist> specialists = new ArrayList<Specialist>();

        while (results.next()) {
            int id = results.getInt("id");
            String specialist = results.getString("specialist");


            specialists.add(new Specialist(id, specialist));
        }

        statement.close();

        return specialists;
    }}