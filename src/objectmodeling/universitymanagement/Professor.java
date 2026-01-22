package objectmodeling.universitymanagement;
import java.util.ArrayList;
import java.util.List;


class Professor {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        System.out.println(name + " teaches:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
