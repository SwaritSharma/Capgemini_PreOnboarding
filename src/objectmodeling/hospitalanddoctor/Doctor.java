package objectmodeling.hospitalanddoctor;
import java.util.ArrayList;

public class Doctor {
    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
        patients.add(patient);
        patient.addDoctor(this);
    }

    public String getName() {
        return name;
    }

    public void showPatients() {
        System.out.println("Patients consulted by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
