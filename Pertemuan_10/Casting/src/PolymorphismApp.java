public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Gura");
        employee.sayHello("Ame");

        employee = new Manager("A-chan", "Hololive");
        employee.sayHello("Ame");

        employee = new VicePresident("Yagoo");
        employee.sayHello("Ame");

        sayHello(new Employee("Gura"));
        sayHello(new Manager("A-chan", "Hololive"));
        sayHello(new VicePresident("Yagoo"));
    }
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
