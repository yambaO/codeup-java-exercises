package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Student [] studentsArray = new Student[3];
        studentsArray[1] = new Student("Henry", grades);

        studentsArray[1].addGrade(78);
        studentsArray[1].addGrade(65);
        studentsArray[1].addGrade(90);
        studentsArray[2] = new Student("Emerald",grades);

        studentsArray[2].addGrade(50);
        studentsArray[2].addGrade(75);
        studentsArray[2].addGrade(60);
        Student student = new Student("Mike",grades);
        student.setGrades(grades);
        student.addGrade(70);
        student.addGrade(90);
        student.addGrade(80);

        System.out.println(Arrays.toString(studentsArray));
        System.out.println(student.getGrades());
        System.out.println( student.getGradeAverage());
    }
}
