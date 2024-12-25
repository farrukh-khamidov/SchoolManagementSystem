public class School {
    private Teacher[] teachers = new Teacher[500];
    private Student[] students = new Student[500];
    private int teacherCount = 0;
    private int studentCount = 0;
    private int totalMoneyEarned = 0;
    private int totalMoneyPaid = 0;
    public void addTeacher(Teacher teacher) {
        teachers[teacherCount++] = teacher;
    }

    public void addStudent(Student student) {
        students[studentCount++] = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void receiveFees(int fees) {
        totalMoneyEarned += fees;
    }

    public void paySalary(Teacher teacher) {
        totalMoneyPaid += teacher.getSalary();
    }

    public int getTotalMoneySpent() {
        return totalMoneyPaid;
    }
}
