package objectmodeling.hospitalanddoctor;

import java.util.ArrayList;
public class Patient {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }

    public void showDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}
