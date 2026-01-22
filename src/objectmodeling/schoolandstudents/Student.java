package objectmodeling.schoolandstudents;

import java.util.ArrayList;

public class Student {
    private String studentName;
    ArrayList<Course>courses=new ArrayList<>();
    public Student(String name)
    {
        studentName=name;
    }
    void enroll(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void showCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return studentName;
    }
}
