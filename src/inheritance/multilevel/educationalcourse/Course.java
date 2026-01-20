package inheritance.multilevel.educationalcourse;

public class Course {
    public String courseName;
    protected int duration;

   public Course(String courseName,int duration)
    {
        this.courseName=courseName;
        this.duration=duration;
    }
    public void courseDetails()
    {
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Duration: "+duration);
    }
}
