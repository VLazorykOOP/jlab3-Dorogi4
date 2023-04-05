public class Administration extends Employee { private String position;

    public Administration(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Position: " + position);
    }
}