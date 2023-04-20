package grades;
import java.util.ArrayList;
import java.util.HashMap;
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
            System.out.print("What student would you like to see more information on? (Enter GitHub username): ");
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
        mike.addGrade(90);
        mike.addGrade(70);
        mike.addGrade(100);
        students.put("CommitmentIssues404",mike);

        ArrayList<Integer> gradeStudent2 = new ArrayList<>();
        Student alice = new Student("Alice", gradeStudent2);
        alice.setGrades(gradeStudent1);
        alice.addGrade(85);
        alice.addGrade(92);
        alice.addGrade(78);
        students.put("GitKrakenJokes", alice);

        ArrayList<Integer> gradeStudent3 = new ArrayList<>();
        Student bob = new Student("Bob", gradeStudent3);
        bob.setGrades(gradeStudent1);
        bob.addGrade(75);
        bob.addGrade(88);
        bob.addGrade(91);
        students.put("MasterOfMergeConflicts", bob);

        ArrayList<Integer> gradeStudent4 = new ArrayList<>();
        Student charlie = new Student("Charlie", gradeStudent4);
        charlie.setGrades(gradeStudent4);
        charlie.addGrade(95);
        charlie.addGrade(79);
        charlie.addGrade(82);
        students.put("RepoRascal", charlie);

        commandLine(students);
    }
}
