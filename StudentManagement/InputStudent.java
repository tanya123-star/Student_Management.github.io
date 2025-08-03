import java.util.Scanner;

public class InputStudent {
    public static Main.Student input(Scanner scanner) {
        System.out.print("Enter ID Number: ");
        String idnum = scanner.nextLine();

        System.out.print("Enter Complete Name: ");
        String completename = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Birthday (e.g., 01/01/2000): ");
        String birthday = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Your Course and Year (e.g., BSIT 1st Year): ");
        String corYear = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        return new Main.Student(idnum, age, address, corYear, birthday, completename, email);
    }
}
