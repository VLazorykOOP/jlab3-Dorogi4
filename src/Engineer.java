class Engineer extends Employee {
    private String specialization;

    public Engineer() {}

    public Engineer(String name, int age, double salary, String jobTitle, String department, String specialization) {
        super(name, age, salary, jobTitle, department);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Specialization: " + specialization);
    }
}
