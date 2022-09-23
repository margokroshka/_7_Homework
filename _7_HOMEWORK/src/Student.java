public class Student {
    String firstName;
    String lastName;
    String group;
    double srMark;

    public Student(String firstName, String lastName, String group, double srMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.srMark = srMark;
    }

    public Student() {
    }

    public double getScholarship(){
        return srMark== 5 ? 100 : 80;
    }
}
