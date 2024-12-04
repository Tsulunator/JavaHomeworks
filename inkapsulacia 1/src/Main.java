public class Main {
    //3
    public static String findTopStudent(Student[] students){
        Student topStudent = students[0];
        for(Student student : students){
            if (student.getGpa() > topStudent.getGpa()){
                topStudent = student;
            }
        }
        return topStudent.getFirstName() + " " + topStudent.getLastName();
    }
    public static void main(String[] args) {
        //1
        /*
        WeatherForecash forecast = new WeatherForecash("New York", 10, 30, false, true, true);
        forecast.printWeatherForecast();
        if (forecast.adviseForWalk()){
            System.out.println("Good to walk");
        }else{
            System.out.println("Don't go outside");
        }
         */

        //2 da 3
        /*
        Student[] students = new Student[5];
        students[0] = new Student("robin", "Banks", 20, 1, 3.5);
        students[1] = new Student("Lebron", "James", 22, 2, 3.8);
        students[2] = new Student("Michael", "Jackson", 21, 3, 3.9);
        students[3] = new Student("Emily", "Davis", 23, 4, 4.0);
        students[4] = new Student("White", "Brown", 19, 1, 3.2);

        String topStudent = findTopStudent(students);
        System.out.println(topStudent);
         */
    }
}