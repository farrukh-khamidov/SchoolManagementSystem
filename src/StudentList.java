public class StudentList {
    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size >= students.length) {
            Student[] newTeachers = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newTeachers[i] = students[i];
            }
            students = newTeachers;
        }
        students[size++] = student;
    }

    public Student get(int index) {
        return students[index];
    }

    public int size() {
        return size;
    }
}
