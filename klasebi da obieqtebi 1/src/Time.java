public class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void printTime(){
        System.out.println(hour +":"+ minute +":"+ second);
    }
}