package inheritance.multilevel.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse{
    private int fee;
    private int discount;

    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,int fee,int discount)
    {
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

    @Override
    public void courseDetails() {
        super.courseDetails();
        System.out.println("Course Fee: "+fee);
        System.out.println("Discount: "+discount);
    }
}
