package gen_assignment.multiLevel_University_Course_Management_System;

import java.util.*;

public class Course<T extends CourseType> {

    public List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public static void showCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}
