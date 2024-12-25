public class School {
    private MyList<Teacher> teachers = new MyList<>();
    private MyList<Student> students = new MyList<>();
    private int totalMoneyEarned = 0;
    private int totalMoneyPaid = 0;
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
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
