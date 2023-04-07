class Administration extends HR {
    private String task;

    public Administration() {}

    public Administration(String name, int age, double salary, String task) {
        super(name, age, salary);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Task: " + task);
    }
}