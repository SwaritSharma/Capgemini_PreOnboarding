package objectmodeling.schoolandstudents;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private  ArrayList<Student>students=new ArrayList<>();
    Course(String courseName)
    {
        this.courseName=courseName;
    }
    void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
