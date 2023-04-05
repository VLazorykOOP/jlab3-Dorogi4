import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args)  throws IOException {
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
        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for worker #" + (i+1));

            System.out.println("Enter name: ");
            String name = getInput(scanner, "^[A-Za-z]+$", "Invalid input. Please enter a name containing only letters.");

            System.out.println("Enter age: ");
            int age = 0;
            while (true) {
                String ageStr = scanner.next();
                if (ageStr.matches("^[0-9]+$")) {
                    age = Integer.parseInt(ageStr);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an age as a number.");
                }
            }
            System.out.println("Enter salary: ");

            double salary = 0;
            while (true) {
                String salaryStr = scanner.next();
                if (salaryStr.matches("^[0-9]+$")) {
                    salary = Integer.parseInt(salaryStr);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an salary as a number.");
                }
            }
            System.out.println("Choose worker type (1 for HR, 2 for Engineer, 3 for Administration): ");
            int workerType = 0;
            while (true) {
                String typeStr = scanner.next();
                if (typeStr.matches("^[1-3]+$")) {
                    workerType = Integer.parseInt(typeStr);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an worker type as a number.");
                }
            }
            if (workerType == 1) {
                System.out.println("Enter experience: ");
                int experience = 0;
                while (true) {
                    String experienceStr = scanner.next();
                    if (experienceStr.matches("^[0-9]+$")) {
                        experience = Integer.parseInt(experienceStr);
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an age as a number.");
                    }
                }
                employees[i] = new HR(name, age, salary, experience);
            } else if (workerType == 2) {
                System.out.println("Enter speciality: ");
                String speciality = getInput(scanner, "^[A-Za-z]+$", "Invalid input. Please enter a speciality containing only letters.");
                employees[i] = new Engineer(name, age, salary, speciality);
            } else if (workerType == 3) {
                System.out.println("Enter position: ");
                String position = getInput(scanner, "^[A-Za-z]+$", "Invalid input. Please enter a position containing only letters.");
                employees[i] = new Administration(name, age, salary, position);
            }
        }

        for (Employee employee : employees) {
            employee.Show();
            System.out.println("--------------");
        }

        scanner.close();
    }

    public static String getInput(Scanner scanner, String regex, String errorMsg) {
        while (true) {
            String input = scanner.next();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println(errorMsg);
        }
    }
}
