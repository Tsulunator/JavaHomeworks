package n1;

public class Student{
    private String firstName;
    private String lastName;
    private int age;
    private double averageGradePoint;
    private String personalNumber;
    private int course;

    public Student(String firstName, String lastName, int age, String personalNumber, double averageGradePoint, int course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalNumber = personalNumber;
        this.averageGradePoint = averageGradePoint;
        this.course = course;
    }

    public void printStudentInfo(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Personal Number: " + personalNumber);
        System.out.println("Average Grade Point: " + averageGradePoint);
        System.out.println("Course: " + course);
    }
}
