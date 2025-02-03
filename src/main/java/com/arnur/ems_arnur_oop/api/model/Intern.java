public class Intern extends Employee {
    private String university;

    public Intern(Long id, String name, String position, double salary, String university) {
        super(id, name, position, salary);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as an intern, alumni of " + university);
    }
}
