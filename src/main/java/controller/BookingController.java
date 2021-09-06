package controller;

import entity.Specialist;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookingController {

    SpecialistController specialistController =new SpecialistController();

    public void viewAllSpecialists() {
        ArrayList<Specialist> specialists = new ArrayList<>();
        specialists = specialistController.getAll();
        System.out.println("All Procedures:\n");
        System.out.println("ID\t\t\t\t Procedure\n");
        for (Specialist currentSpecialist : specialists) {

            System.out.println(currentSpecialist.getId() + "\t\t\t\t  " + currentSpecialist.getSpecialist()+"\n");
            System.out.println("To which procedure you would like to book appointment? Enter ID");
        }
    }



}
