package LinkedList.StudentRecordManagement;

public class Student {

    final int rollNo;
    final String name;
    int age;
    int grade;

    public Student(int rollNo, String name, int age, int grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age=age;
        this.grade=grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
