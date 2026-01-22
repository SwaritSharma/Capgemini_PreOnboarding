package objectmodeling.schoolandstudents;

import java.util.ArrayList;

public class School {
    private String schoolName;
    ArrayList<Student>students=new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
