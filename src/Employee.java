import javax.swing.*;

public class Employee {
    private String name;
    private int salary;
    private int department;
    static int id = 0;
    String information;
    public static String[] Employee = new String[10];

    public Employee(String name, int salary, int department) {
        if (department < 1 || department > 5) {
            throw new RuntimeException("ERROR");
        }
        this.name = name;
        this.salary = salary;
        this.department = department;
        information = "Name " + name + " , Salary " + salary + " , Department " + department;
        Employee[id] = information;
        id++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public static String allToString() {
        for (int i = 0; i < Employee.length; i++) {
            return Employee[i];
        }
        return Employee[id];
    }
}
