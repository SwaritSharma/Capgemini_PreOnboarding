package objectmodeling.schoolandstudents;

public class Test {
    static void main() {

        School school = new School("Chitkara");

        Student john = new Student("John");
        Student sam = new Student("Sam");

        Course dsa = new Course("DSA");
        Course devOps = new Course("DevOps");

        school.addStudent(john);
        school.addStudent(sam);

        john.enroll(dsa);
        john.enroll(devOps);
        sam.enroll(dsa);

        john.showCourses();
        sam.showCourses();

        dsa.showStudents();
        devOps.showStudents();
    }
}
