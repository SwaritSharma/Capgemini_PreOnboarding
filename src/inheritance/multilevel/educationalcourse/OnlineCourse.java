package inheritance.multilevel.educationalcourse;

public class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded)
    {
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override
    public void courseDetails() {
        super.courseDetails();

        System.out.println("Course Platform: "+platform);
       if(isRecorded) System.out.println("Course is Recorded");
       else System.out.println("Course is not Recorded");
    }
}
