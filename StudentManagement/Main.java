import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static class Student { //kani is the inner class for Student
        String idnum; // kani mga attributes sa Student class
        int age;
        String address;
        String corYear;
        String birthday;
        String completename;
        String email;

        public Student(String idnum, int age, String address, String corYear, String birthday, String completename, String email) { // constructor to initialize the attributes
            this.idnum = idnum;
            this.age = age;
            this.address = address;
            this.corYear = corYear;
            this.birthday = birthday;
            this.completename = completename;
            this.email = email;
        }

        public void display() {
            System.out.println("\n-----------Student Profile-----------");
            System.out.println("ID Number         : " + idnum);
            System.out.println("Name              : " + completename);
            System.out.println("Age               : " + age);
            System.out.println("Birthday          : " + birthday);
            System.out.println("Address           : " + address);
            System.out.println("Course and Year   : " + corYear);
            System.out.println("Email             : " + email);
            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) { // kani ang switch case para sa menu options para sa student management
                case 1:
                    Student newStudent = InputStudent.input(scanner); // kani ang pagkuha sa input sa user para sa pag-add sa student
                    students.add(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    DisplayStudent.displayAll(students);//call out the displayAll method from DisplayStudent class to show all students
                    break;

                case 3:
                    SearchStudent.searchByName(students, scanner);// call out the searchByName method from SearchStudent class to search for a student by name
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);//kani ang loop para sa menu hangtud sa mo-exit ang user

        scanner.close();
    }
}
