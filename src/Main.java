import java.lang.management.MonitorInfo;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsDatabase = new ArrayList<>();
        studentsDatabase.add(new Student("Daniil", 22, "gigaChad", true));
        studentsDatabase.add(new Student("Maurice", 23, "betaMale", false));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userInput;


            System.out.println("Input name of searched Student:");
            userInput = scanner.nextLine();
            checkName(userInput, studentsDatabase);
            if (checkName(userInput, studentsDatabase)) {
                System.out.println("Student with this name found!");

            } else {
                System.out.println("Student with this name not found!");

            }
        }

    }

    public static boolean checkName(String userInput, ArrayList<Student> studentsDatabase) {
        for (Student student : studentsDatabase) {
            if (Objects.equals(student.name, userInput)) {
                System.out.println(student.age);
                System.out.println(student.gender);
                System.out.println(student.Scholarship);
                return true;
            }
        }
        studentsDatabase.contains(studentsDatabase);
        return false;
    }


}


