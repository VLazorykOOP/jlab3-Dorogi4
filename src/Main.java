import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 0;
        while (true) {
            System.out.print("Enter number of workers: ");
            String input = scanner.next();
            if (input.matches("^[0-9]+$")) {
                numEmployees = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        HR[] employees = new HR[numEmployees];

        for (int i = 0; i < employees.length; i++) {
            int type = 0;
            while (true) {
                System.out.println("Enter employee type (1 = Employee, 2 = Administration, 3 = Engineer):");
                if (scanner.hasNextInt()) {
                    type = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
                    if (type >= 1 && type <= 3) {
                        break;
                    } else {
                        System.out.println("Invalid employee type entered. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // clear input buffer
                }
            }
            System.out.println("Enter name:");
            String name = getInput(scanner, "^[A-Za-z ,:;().\\-]+$", "Invalid input. Please enter a name containing only Latin letters.");



            System.out.println("Enter age:");
            int age = 0;
            while (true) {
                String ageStr = scanner.nextLine();
                if (ageStr.matches("^[0-9]+$")) {
                    age = Integer.parseInt(ageStr);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an age as a number.");
                }
            }

            System.out.println("Enter salary:");
            double salary = 0;
            while (true) {
                String salaryStr = scanner.nextLine();
                if (salaryStr.matches("^[0-9]+(\\.[0-9]+)?$")) {
                    salary = Double.parseDouble(salaryStr);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a salary as a number.");
                }
            }

            switch (type) {


                case 1:
                    System.out.println("Enter job title:");
                    String jobTitle = getInput(scanner, "^[A-Za-z,;:().\\s]+$", "Invalid input. Please enter a job title containing only letters.");
                    System.out.println("Enter department:");
                    String department = getInput(scanner, "^[A-Za-z,;:().\\s]+$", "Invalid input. Please enter a department containing only letters.");
                    employees[i] = new Employee(name, age, salary, jobTitle, department);
                    break;



                case 2:
                    System.out.println("Enter task:");
                    String task = getInput(scanner, "^[A-Za-z,;:().\\s]+$", "Invalid input. Please enter a task containing only letters.");
                    employees[i] = new Administration(name, age, salary, task);
                    break;


                case 3:

                    System.out.println("Enter job Tile:");/* посада*/
                    jobTitle = getInput(scanner, "^[A-Za-z,;:().\\s]+$", "Invalid input. Please enter a job title containing only letters.");

                    System.out.println("Enter department:");
                    department = getInput(scanner, "^[A-Za-z,;:().\\s]+$", "Invalid input. Please enter a department containing only letters.");

                    System.out.println("Enter specialization:");
                    String specialization = getInput(scanner, "^[A-Za-z,;:().\\s]+$", "Invalid input. Please enter a specialization containing only letters.");

                    employees[i] = new Engineer(name, age, salary, jobTitle, department, specialization);
                    break;
                default:
                    System.out.println("Invalid employee type entered. Please try again.");
                    i--;
                    break;
            }
        }

        System.out.println("Employees entered:");
        for (HR employee : employees) {
            employee.show();
            System.out.println();
        }

    }

    private static String getInput(Scanner scanner, String pattern, String errorMessage) {
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(pattern)) {
                return input;
            } else {
                System.out.println(errorMessage);
            }
        }
    }
}