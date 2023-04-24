package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.Input;

public class GradesApplication extends Student {
    public static void commandLine(HashMap<String, Student> students) {

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");
        students.forEach((key, value) -> {
            System.out.printf("|%s| ", key);
        });
        Input input = new Input();
        String choice;
        do {
            System.out.println("What student would you like to see more information on? (Enter GitHub username): ");
            String username = input.getString();
            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.println("Name: " + student.getName() + " - GitHub Username: " + username);
                System.out.println("Current Average: " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + username + "\".");
            }

            System.out.print("Would you like to see another student? (yes/no): ");
            choice = input.getString();
            System.out.println();
        } while (input.yesNo(choice));

        System.out.println("Goodbye, and have a wonderful day!");
    }
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        ArrayList<Integer> gradeStudent1 = new ArrayList<>();
        Student mike = new Student("Mike",gradeStudent1);
        mike.setGrades(gradeStudent1);
        mike.addGrades(new ArrayList<>(List.of(90,70, 100)));
        students.put("CommitmentIssues404",mike);

        ArrayList<Integer> gradeStudent2 = new ArrayList<>();
        Student alice = new Student("Alice", gradeStudent2);
        alice.setGrades(gradeStudent1);
        alice.addGrades(new ArrayList<>(List.of(85,92, 78)));
        students.put("GitKrakenJokes", alice);

        ArrayList<Integer> gradeStudent3 = new ArrayList<>();
        Student bob = new Student("Bob", gradeStudent3);
        bob.setGrades(gradeStudent1);
        bob.addGrades(new ArrayList<>(List.of(75,88, 91)));
        students.put("MasterOfMergeConflicts", bob);

        ArrayList<Integer> gradeStudent4 = new ArrayList<>();
        Student charlie = new Student("Charlie", gradeStudent4);
        charlie.setGrades(gradeStudent4);
        charlie.addGrades(new ArrayList<>(List.of(95,79, 82)));
        students.put("RepoRascal", charlie);

        commandLine(students);
    }
}
