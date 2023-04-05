public class Employee {
    private String Name;
    private int age;
    private double salary;

    {
        Name = "Noname N.";
        age = 45;
        salary = 1005.01;


    }
    public Employee (String n, int a , double s) {
        Name = n;
        age = a;
        salary = s;

    }
    public Employee(String in_name){
        Name=in_name;
        age= 30;
        salary=1000;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void Show() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
