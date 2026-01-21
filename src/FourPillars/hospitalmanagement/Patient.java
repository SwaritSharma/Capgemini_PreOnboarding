package FourPillars.hospitalmanagement;
import java.util.ArrayList;
import java.util.List;
public abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;

    private String diagnosis;
    private List<String> medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }
    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
