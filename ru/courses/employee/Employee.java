public class Employee {
    private final String name;
    private Department dep;

    public Employee(String name) {
        this.name = name;
    }

    public String getEmpDepName() {
        if (this.dep == null)
            throw new IllegalArgumentException("Set the department for employee");
        return dep.getDepName();
    }

    void setDepartment(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        if (dep == null)
            throw new IllegalArgumentException("Employee must be in department");
        if (this == dep.getDepBoss()) {
            return name + " начальник отдела " + getEmpDepName();
        }
        else {
            return name + " работает в отделе " + getEmpDepName() + ", начальник которого " + dep.getDepBoss().name;
        }
    }
}
