public class School {
    private Teacher[] teachers = new Teacher[2];
    private Student[] students = new Student[2];
    private int teacherCount = 0;
    private int studentCount = 0;
    private int totalMoneyEarned = 0;
    private int totalMoneyPaid = 0;
    public void addTeacher(Teacher teacher) {
        if (teacherCount >= teachers.length) {
            Teacher[] newTeachers = new Teacher[teachers.length * 2];
            for (int i = 0; i < teachers.length; i++) {
                newTeachers[i] = teachers[i];
            }
            teachers = newTeachers;
        }
        teachers[teacherCount++] = teacher;

    }

    public void addStudent(Student student) {
        students[studentCount++] = student;
        if (studentCount >= students.length) {
            Student[] newStudents = new Student[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
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
