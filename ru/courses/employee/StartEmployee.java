public class StartEmployee {
    public static void main(String[] args) {
        Department it = new Department("IT");
        Department fin = new Department("Fin");
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Steve");
        Employee emp3 = new Employee("Bruce");
        Employee emp4 = new Employee("Ann");
        Employee emp5 = new Employee("Nick");
        it.addEmployee(emp1);
        it.addEmployee(emp4);
        it.addEmployee(emp2);
        fin.addEmployee(emp3);
        fin.setDepBoss(emp3);
        it.setDepBoss(emp4);
        fin.addEmployee(emp5);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
    }
}
