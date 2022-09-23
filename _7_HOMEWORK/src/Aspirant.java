public class Aspirant extends Student{
    String SinceWork;

    @Override
    public double getScholarship() {
        return srMark== 5 ? 200 : 180;
    }

    public Aspirant(String firstName, String lastName, String group, double srMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.srMark = srMark;
    }

    public Aspirant(String firstName, String lastName, String group, double srMark, String sinceWork) {
        this (firstName, lastName, group, srMark);
       this.SinceWork = sinceWork;
    }
}
