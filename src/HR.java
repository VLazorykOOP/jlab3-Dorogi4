public class HR extends Employee { private int experience;

    public HR(String name, int age, double salary, int experience) {
        super(name, age, salary);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Experience: " + experience);
    }
}