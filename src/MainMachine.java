public class MainMachine {
    public static void main(String[] args) {
        Employee sasha = new Employee("Sasha", 50000, 3);
        Employee aleksSasha = new Employee("Aleks", 70000, 3);
        System.out.println(Employee.allToString());
    }
}