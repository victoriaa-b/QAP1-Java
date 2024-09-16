public class date {
    private int day;
    private int month;
    private int year;


    // Constructor
    public date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }

    // methods to return the answer (getter/setters)
    public int getDay() {

        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth(){

        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

// Displays the date in the format dd/mm/yyyy
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
