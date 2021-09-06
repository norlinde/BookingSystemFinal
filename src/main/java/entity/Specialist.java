package entity;

public class Specialist {
    private int id;
    private String specialist;

    public Specialist() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public Specialist(int id, String specialist) {
        this.id = id;
        this.specialist = specialist;

    }
}
