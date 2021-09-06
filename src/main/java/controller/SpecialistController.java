package controller;

import entity.Specialist;
import repository.SpecialistRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class SpecialistController {

    SpecialistRepository specialistRepository = new SpecialistRepository();

    public ArrayList<Specialist> getAll() {
        ArrayList<Specialist> specialists = new ArrayList<Specialist>();
        try {
            specialists = specialistRepository.getAll();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return specialists;
    }

}
