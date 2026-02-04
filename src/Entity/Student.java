package Entity;

public class Student {

    private  final int rollNo;
    private final String name;
    private String address;

    public Student(int rollNo , String name , String address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails(Student s){
        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        System.out.println(s.getAddress());
    }
}
