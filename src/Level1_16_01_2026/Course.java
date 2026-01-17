package Level1_16_01_2026;

public class Course {
    private String courseName;
    private int duration;
    private int fee;

    static String instituteName="Chitkara";

    Course(String courseName,int duration,int fee)
    {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    Course(Course course)
    {
        this.courseName=course.courseName;
        this.duration=course.duration;
        this.fee=course.fee;
    }

    public void displayCourseDetails()
    {
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Duration: "+duration);
        System.out.println("Course Fee: "+fee);
    }
    public static void updateInstituteName(String name)
    {
        instituteName=name;
    }
}
