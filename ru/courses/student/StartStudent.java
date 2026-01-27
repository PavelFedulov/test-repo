public class StartStudent {
    public static void main(String[] args) {
        int[] grades = {2, 3, 5};
        Student alex = new Student("Alex");
        Student john = new Student("John", grades);
        System.out.println(alex);
        System.out.println(john);
//        alex.grades[0] = 2;
        alex.addGrade(5);
        alex.addGrade(4);
        alex.addGrade(4);
        john.addGrade(3);
        john.addGrade(2);
//        alex.addGrade(1);
        System.out.println(alex);
        System.out.println(john);
        System.out.println(alex.getGrades());
        System.out.println(john.getGrades());
    }
}
