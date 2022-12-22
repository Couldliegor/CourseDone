public class MainMachine {
    public static void main(String[] args) {
        Employee sashaVladich = new Employee("Vladich Alexandra Fromskaya", 50000, 3);
        Employee alexAlexandrovskiy = new Employee("Alexandrovskiy Alex Rubanov", 70000, 4);
        Employee egorTheCreator = new Employee("Kudlay Egor Vladimirovich", 900000, 1);
        System.out.println(Employee.allToString());
        System.out.println("The sum of month salary for all workers is: " + Employee.getMonthSalary());
        Employee.space();
        System.out.println("The minimal Salary has" + Employee.minMonthSalary());
        Employee.space();
        System.out.println("The max Salary has" + Employee.maxMonthSalary());
        Employee.space();
        System.out.println("middle month salary is " + Employee.middleValueSalary());
        Employee.space();
        System.out.println("Full names of all workers: " + Employee.getFullNames());
    }
}