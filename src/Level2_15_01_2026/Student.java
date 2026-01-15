package Level2_15_01_2026;


import java.util.Scanner;

class Student {

    String name;
    int rollNumber;
    int marks;

    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else
            return 'D';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.name = sc.nextLine();
        s.rollNumber = sc.nextInt();
        s.marks = sc.nextInt();

        s.displayDetails();
    }
}
