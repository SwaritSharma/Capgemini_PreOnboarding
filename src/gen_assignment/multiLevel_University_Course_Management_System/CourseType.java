package gen_assignment.multiLevel_University_Course_Management_System;

public abstract class CourseType {
    private final String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

