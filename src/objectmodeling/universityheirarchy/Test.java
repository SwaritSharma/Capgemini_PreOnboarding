package objectmodeling.universityheirarchy;

public class Test {
    static void main() {
        Faculty profA = new Faculty("Dr. John");
        Faculty profB = new Faculty("Dr. Johnson");

        University uni = new University("Chitkara University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        uni.addFaculty(profA);
        uni.addFaculty(profB);

        uni.showFaculty();

        uni.deleteUniversity();

        System.out.println("\nFaculty still exist after university deletion:");
        profA.displayName();
        profB.displayName();
    }
}
