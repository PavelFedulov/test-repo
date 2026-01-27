public class Department {
    private final String depName;
    private Employee boss;

    public Department(String depName) {
        this.depName = depName;
    }

    public String getDepName() {
        return this.depName;
    }

    public Employee getDepBoss() {
        return boss;
    }

    public void addEmployee(Employee emp) {
        emp.setDepartment(this);
    }

    public void setDepBoss(Employee boss) {
        if (!boss.getEmpDepName().equals(this.depName))
            throw new IllegalStateException("Employee must be in the same department");
        this.boss = boss;
    }
}
