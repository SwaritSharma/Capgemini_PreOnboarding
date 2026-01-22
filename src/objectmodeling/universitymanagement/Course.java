package objectmodeling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println(professor.getName() + " assigned to " + courseName);
    }

    void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Students enrolled:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
