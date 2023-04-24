package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(){};

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // returns the student's name
    public String getName(){
       return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
      this.grades.add(grade);
    }
    // adds the given an array of grade to the grades property
    // returns the average of the students grades
    public void addGrades(int[] newGrades) {
        for (int grade : newGrades) {
            grades.add(grade);
        }
    }
    public void addGrades(ArrayList<Integer> grades){
        this.grades.addAll(grades);
    }
    public double getGradeAverage() {
        if (this.grades.size() == 0) {
            return 0.0;
        } else {
            int sum = 0;
            for (int grade : this.grades) {
                sum += grade;
            }
            return (double) sum / this.grades.size();
        }
    }
}
