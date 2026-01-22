package objectmodeling.universitymanagement;

public class Test {
    static void main() {
        Student s1 = new Student("John");
        Student s2 = new Student("Sam");

        Professor p1 = new Professor("Dr. Fisher");

        Course dsa = new Course("DSA");
        Course devops = new Course("DevOps");

        dsa.assignProfessor(p1);
        devops.assignProfessor(p1);

        s1.enrollCourse(dsa);
        s1.enrollCourse(devops);
        s2.enrollCourse(dsa);

        System.out.println();
        s1.showCourses();
        s2.showCourses();

        System.out.println();
        p1.showCourses();

        System.out.println();
        dsa.showDetails();
    }
}
