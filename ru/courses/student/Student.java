import java.util.Arrays;

public class Student {
    private final String name;
    private int[] grades;

    public Student(String name) {
        this.name = name;
        this.grades = new int[0];
    }

    public Student(String name, int[] grades) {
        this.name = name;
        for (int grade : grades) {
            if (grade < 2 || grade > 5)
                throw new IllegalArgumentException("grade must be between 2 and 5");
        }
        this.grades = grades;
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5)
            throw new IllegalArgumentException("grade must be between 2 and 5");
        this.grades = Arrays.copyOf(grades, grades.length + 1);
        grades[grades.length - 1] = grade;
    }

    public String getGrades() {
        return Arrays.toString(grades);
    }

    @Override
    public String toString() {
        return name + ':' + Arrays.toString(grades);
    }
}
