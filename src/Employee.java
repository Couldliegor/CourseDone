import javax.swing.*;

public class Employee {
    private String name;
    private int salary;
    private int department;
    static int id = 0;
    String information;
    private static int monthSalary = 0;
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
        information = "Name " + name + " , Salary " + salary + " , Department " + department + ".";
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
        String information1 = null;
        for (int i = 0; i < id; i++) {
           information1 = information1 + Information[i] + "\n";
        }
        return information1.replace("null" , ""); // ибо я не знаю откуда этот null в начале при запусе for, поэтому я не нашел способа ениальнее )))
    }

    public static int getMonthSalary() {
        for (int i = 0; i < allSalaryMassive.length; i++) {
            monthSalary = monthSalary + allSalaryMassive[i];
        }
        return monthSalary;
    }

    public static String minMonthSalary() {
        int min = allSalaryMassive[0];
        int l = 0;
        for (int i = 0; i < id; i++) {
            if (min > allSalaryMassive[i]) {
                min = allSalaryMassive[i];
                l = i;
            }
        }
        return Information[l].replace("Name","");
    }
    public static String maxMonthSalary() {
        int max = allSalaryMassive[0];
        int l = 0;
        for (int i = 0; i < id; i++) {
            if (max < allSalaryMassive[i]) {
                max = allSalaryMassive[i];
                l = i;
            }
        }
        return Information[l].replace("Name","");
    }
}
