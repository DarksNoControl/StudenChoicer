import java.lang.management.MonitorInfo;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Daniil", 22, "Male", true);
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Input Name of searched Student:");
            userInput = scanner.nextLine();

            if (!checkName(userInput, student1)) {
                System.out.println("No such student is in the list!");

            }
        }
        while (!checkName(userInput, student1));
        {
            System.out.println("First Student based on your Search results:" + "\n" + "\n" + student1.name + " " + student1.age + " " + student1.gender + "\n");
            System.out.println("Scholarship Status is:" + "\n" + student1.Scholarship);
            scanner.close();
        }

    }

    public static boolean checkName(String userInput, Student student1) {
        return student1.name.equals(userInput);

    }
}
