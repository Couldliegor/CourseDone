public class MainMachine {
    public static void main(String[] args) {
        mainMachine();
    }
    public static void mainMachine() {
        Employee sashaVladich = new Employee("Vladich Alexandra Fromskaya", 50000, 3);
        Employee alexAlexandrovskiy = new Employee("Alexandrovskiy Alex Rubanov", 70000, 4);
        Employee egorTheCreator = new Employee("Kudlay Egor Vladimirovich", 900000, 1);
        System.out.println(Employee.allToString());
        System.out.println("The sum of month salary for all workers is: " + Employee.getMonthSalary());
        Markup.space();
        System.out.println("The minimal Salary has" + Employee.minMonthSalary());
        Markup.space();
        System.out.println("The max Salary has" + Employee.maxMonthSalary());
        Markup.space();
        System.out.println("middle month salary is " + Employee.middleValueSalary());
        Markup.space();
        System.out.println("Full names of all workers: " + Employee.getFullNames());
        Markup.space();
        // Harder part now
        System.out.println(Employee.percentsPerWorker(13));
    }
}