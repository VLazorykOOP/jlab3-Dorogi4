package Ex3;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ICurrency d = new Dollar();
        System.out.print("Enter amount in dollars: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        double dollarAmount = scanner.nextDouble();
        d.setAmount(dollarAmount);

        System.out.println(d.toUAH() +  "UAH" );
        d.printAmount();

        ICurrency e = new Euro();
        System.out.print("Enter amount in euros: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        double euroAmount = scanner.nextDouble();
        e.setAmount(euroAmount);

        System.out.println(e.toUAH()  +  "UAH");
        e.printAmount();
    }
}