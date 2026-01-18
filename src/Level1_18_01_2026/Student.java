package Level1_18_01_2026;
class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    String name;
    final int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Grade: " + student.grade);
        } else {
            System.out.println("Object is not a Student instance.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        s1.displayStudentDetails(s1);
        s2.displayStudentDetails(s2);
        Student.displayTotalStudents();
    }
}
