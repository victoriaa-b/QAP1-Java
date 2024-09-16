public class time {
    private int hour;
    private int minute;
    private int second;


    // Constructors
    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // methods to return the answer (getter/setters)
    public int getHour(){
        
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute(){

        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSecond(){

        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    // the format for the display
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

      // for doing a second ahead - increase
    public time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // for doing a second behind - decrease
    public time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
