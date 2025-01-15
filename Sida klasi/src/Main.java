import n1.*;

public class Main {
    public static void main(String[] args){
        //1
        /*
        University university = new University("Tech n1.University", true, 10);
        university.printUniversityInfo();
        System.out.println();
        Student student = new Student("John", "Doe", 20, "12345", 3.8, 2);
        student.printStudentInfo();
         */

        //2
        /*
        Car[] cars = {
                new Car("Toyota", "Toyota", "Toyota", "Toyota", "Toyota", 1, 150000),
                new Car("Honda", "Honda", "Honda", "Honda", "Honda", 4, 200000),
                new Car("Ford", "Ford", "Ford", "Ford", "Ford", 1, 100000)
        };
        Car carWithMaxResource = cars[0];
        for(Car car : cars){
            if(car.engine.resource > carWithMaxResource.engine.resource) {
                carWithMaxResource = car;
            }
        }
        carWithMaxResource.printCarInfo();
         */

        //3
        /*
        Computer myComputer = new Computer("China", "Zima", 4200, true, 3, "4000x4000", 120, 2, "AR15", 6348);
        myComputer.printComputerInfo();
         */

        //4
        /*
        Message sms = new Message("John", "Alice", "Hello, this is a test SMS!"){
            public void send(){
                System.out.println("Sending SMS");
                System.out.println("Sender: " + sender);
                System.out.println("Recipient: " + recipient);
                System.out.println("Message: " + messageText);
            }
            public void receive(){
                System.out.println("Receiving SMS");
                System.out.println(sender + ":" +messageText);
            }
        };
        sms.send();
        sms.receive();
         */
    }
}
