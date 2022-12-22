import javax.swing.*;

public class Employee {
    private String name;
    private int salary;
    private int department;
    static int id = 0;
    String information;
    private static int monthSalary = 0;
    static String information1;
    public static String[] Employee = new String[10];
    public static String[] Information = new String[10];
    public static int[] allSalaryMassive = new int[10];
    public Employee(String name, int salary, int department) {
        if (department < 1 || department > 5) {
            throw new RuntimeException("ERROR");
        }
        this.name = name;
        this.salary = salary;
        this.department = department;
        information = "Name " + name + " , Salary " + salary + " , Department " + department;
        Information[id] = information;
        allSalaryMassive[id] = salary;
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
        for (int i = 0; i < id; i++) {
           information1 = information1 + Information[i] + "\n";
        }
        return information1;
    }

    public static int getMonthSalary() {
        for (int i = 0; i < allSalaryMassive.length; i++) {
            monthSalary = monthSalary + allSalaryMassive[i];
        }
        return monthSalary;
    }
}
