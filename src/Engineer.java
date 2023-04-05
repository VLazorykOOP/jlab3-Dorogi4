public class Engineer extends Employee { private String speciality;

    public Engineer(String name, int age, double salary, String speciality) {
        super(name, age, salary);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Speciality: " + speciality);
    }
}