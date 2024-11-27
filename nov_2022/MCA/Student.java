
package nov_2022.MCA;

public class Student {
    String name;
    int rollno;
    int subject1Marks, subject2Marks, subject3Marks;


    public Student(String name, int rollno,int subject1Marks,int subject2Marks,int subject3Marks){
        this.name = name;
        this.rollno = rollno;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks; 
        this.subject3Marks = subject3Marks;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Subject 1: " + subject1Marks);
        System.out.println("Subject 2: " + subject2Marks);
        System.out.println("Subject 3: " + subject3Marks);
    }

    public int[] getSubjectMarks(){
        return new int[]{subject1Marks,subject2Marks,subject3Marks};
    }
}
