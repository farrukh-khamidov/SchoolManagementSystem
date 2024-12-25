public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private int feesTotal;
    public Student(int id, String firstName, String lastName, int grade, int feesTotal) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesTotal = feesTotal;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void pay(int feesPaid) {
        feesTotal -= feesPaid;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getRemainingFees() {
        return feesTotal;
    }
}
