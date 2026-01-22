package objectmodeling.hospitalanddoctor;

public class Test {
    static void main() {
        Hospital hospital = new Hospital("Neelam Hospital");

        Doctor d1 = new Doctor("Dr. John");
        Doctor d2 = new Doctor("Dr. Sam");

        Patient p1 = new Patient("ABc");
        Patient p2 = new Patient("def");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();
        d1.showPatients();
        d2.showPatients();

        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }

}
