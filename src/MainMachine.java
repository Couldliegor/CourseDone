public class MainMachine {
    public static void main(String[] args) {
        Employee sasha = new Employee("Sasha", 50000, 3);
        Employee aleksSasha = new Employee("Aleks", 70000, 4);
        Employee egorTheCreator = new Employee("Aleks", 900000, 1);
        System.out.println(Employee.allToString());
        System.out.println("The sum of month salary for all workers is: " + Employee.getMonthSalary() + "\n");
        System.out.println("The minimal Salary has" + Employee.minMonthSalary() + "\n");
        System.out.println("The max Salary has" + Employee.maxMonthSalary());
    }
}