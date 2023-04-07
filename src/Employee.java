class Employee extends HR {
    private String jobTitle;
    private String department;

    public Employee() {}

    public Employee(String name, int age, double salary, String jobTitle, String department) {
        super(name, age, salary);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Department: " + department);
    }
}
