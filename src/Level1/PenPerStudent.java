package Level1;

public class PenPerStudent {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        System.out.println("The Pen Per Student is " + (totalPens / totalStudents) + " and the remaining pens not distributed are " + (totalPens % totalStudents));
    }
}
