public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int course; // Course year (e.g., 1 for freshman, 2 for sophomore, etc.)
    private double gpa;

    public Student(String firstName, String lastName, int age, int course, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getCourse(){
        return course;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
}