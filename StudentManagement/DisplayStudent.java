import java.util.ArrayList;

public class DisplayStudent {
    public static void displayAll(ArrayList<Main.Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Main.Student student : students) {
                student.display();
            }
        }
    }
}
