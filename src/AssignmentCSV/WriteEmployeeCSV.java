package AssignmentCSV;

import java.io.*;

public class WriteEmployeeCSV {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("resources/employees.csv");
        fw.write("ID,Name,Department,Salary\n");
        fw.write("1,Amit,IT,75000\n");
        fw.write("2,Riya,HR,65000\n");
        fw.write("3,Kunal,Finance,80000\n");
        fw.write("4,Neha,IT,90000\n");
        fw.write("5,Arjun,Sales,60000\n");
        fw.close();
    }
}
