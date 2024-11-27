package nov_2022;
// Write a package MCA which has one class student. Accept student
// details through parameterized constructor. Write display() method to
// display details. Create a main class which will use package and calculate total marks and percentage.

import nov_2022.MCA.Student;

public class q3b {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20, 90, 80, 70);
        int[] s1Marks = s1.getSubjectMarks();
        s1.display();
        System.out.println("Total Marks: " + calculateTotalMarks(s1Marks));
        System.out.println("Percentage: " + calculatePercentage(s1Marks));
    }

    public static int calculateTotalMarks(int[] marks){
        int totalMarks = 0;
        for(int i=0;i<marks.length;i++){
            totalMarks += marks[i];
        }
        return totalMarks;
    }

    public static double calculatePercentage(int[] marks){
        return (double)calculateTotalMarks(marks)/marks.length;
    }
}
