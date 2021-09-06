import controller.BookingController;
import controller.SpecialistController;

import java.util.Scanner;

public class Menu {


    public void showHomeScreen() {
        Scanner scanner = new Scanner(System.in);
        SpecialistController specialistController = new SpecialistController();
        BookingController bookingController = new BookingController();
        String choice = "";

        System.out.println("\nWelcome to the SPA BOOKING system\n"
                + "\n1. View procedures"
                + "\n2. Choose your time"
                + "\n3. Book now"
                + "\n4. Delete appointment"
                + "\n5. Exit\n"

        );

        System.out.print("\nChoose the number for activity You would like to perform: ");
        choice = scanner.nextLine();

        switch (choice) {
            case "1":
                bookingController.viewAllSpecialists();
                break;
            case "2":
                chooseTime();
                break;
            case "3":
                bookNow();
                break;
            case "4":
                deleteAppointment();
                break;
            case "5":
                System.out.println("Have a great day!");
                return;
            default:
                break;

        }
        while (!choice.equals("14")) ;

        return;
    }



    private void bookNow() {
    }

    private void chooseTime() {
    }

    private void deleteAppointment() {
    }
}

    
