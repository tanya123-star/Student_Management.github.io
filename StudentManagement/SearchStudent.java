import java.util.ArrayList;
import java.util.Scanner;

public class SearchStudent {
    public static void searchByName(ArrayList<Main.Student> students, Scanner scanner) {
        System.out.print("Enter Student Name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (Main.Student student : students) {
            if (student.completename.equalsIgnoreCase(searchName)) {
                System.out.println("\nStudent found:");
                student.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchName + " not found.");
        }
    }
}
