package LinkedList.StudentRecordManagement;

public class StudentLinkedListTest {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(new Student(1, "Aman", 20, 85));
        list.addAtEnd(new Student(2, "Riya", 21, 90));
        list.addAtPosition(2, new Student(3, "Kunal", 22, 88));

        list.display();

        System.out.println("Searching RollNo 2:");
        System.out.println(list.searchByRollNo(2));

        list.updateGrade(2, 95);
        list.deleteByRollNo(1);

        System.out.println("After Updates:");
        list.display();
    }
}
