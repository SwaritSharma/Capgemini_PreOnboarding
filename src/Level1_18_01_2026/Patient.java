package Level1_18_01_2026;
class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    String name;
    int age;
    String ailment;
    final String patientID;

    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patient.patientID);
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Ailment: " + patient.ailment);
        } else {
            System.out.println("Object is not a Patient instance.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Flu", "P001");
        Patient p2 = new Patient("Bob", 45, "Cold", "P002");

        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);
        Patient.getTotalPatients();
    }
}
