package objectmodeling.universityheirarchy;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Faculty> facultyMembers = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }
    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }
    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }
    void showFaculty() {
        System.out.println("Faculty at " + name + ":");
        for (Faculty f : facultyMembers) {
            f.displayName();
        }
    }
    void deleteUniversity() {
        System.out.println("Deleting University '" + name + "'");
        for (Department d : departments) {
            d.delete();
        }
        departments.clear();
    }
}
