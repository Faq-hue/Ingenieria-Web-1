

import java.time.LocalDate;
import java.util.Objects;
import javax.management.RuntimeErrorException;

public class MyDate {

    private int year;
    private int month;
    private int day;

    static public String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
   
    static public String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    static public int[] DAYS_IN_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Constructor

    public MyDate(int year, int month, int day) {

        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);

    }

    // setters and getters

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {

        if (year < 1 && year > 9999) {

            throw new RuntimeErrorException(null, "Invalid year");

        }

        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {

        if (month < 1 && month > 12) {

            throw new RuntimeErrorException(null, "Invalid month");

        }

        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {

        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && day > 31) {

            throw new RuntimeErrorException(null, "Invalid day");

        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {

            throw new RuntimeErrorException(null, "Invalid day");

        }

        if (isLeapYear(year) && day > 29 && month == 2 ) {

            throw new RuntimeErrorException(null, "Invalid day");

        }

        if (month == 2 && day > 28 && !isLeapYear(this.year)) {

            throw new RuntimeErrorException(null, "Invalid day");

        }

        this.day = day;
    }

    // Methods

    static public boolean isLeapYear(int year) {

        if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ){

            return true;

        }else{

            return false;
        }

    }

    static public boolean isValidDate(int year, int month, int day) {

        if (year < 1 || year > 9999) {

            return false;

        }

        if (month < 1 || month > 12) {

            return false;

        }

       if (isLeapYear(year) && day > 29 && month == 2) {

            return false;

        }

        if (!isLeapYear(year) && day > DAYS_IN_MONTHS[1]) {

            return false;

        }

        if ( day > DAYS_IN_MONTHS[month - 1] ){

            return false;

        }

        return true;
    }

    static public String getDayOfWeek(int year, int month, int day) {

        String monthString = month + "";
        String dayString = day + "";

        if (month < 10) {
            monthString = "0" + month;
        }

        if (day < 10) {
            dayString = "0" + day;
        }

        LocalDate dt = LocalDate.parse(year + "-" + monthString + "-" + dayString);

        return dt.getDayOfWeek().toString();
    }

    public void setDate(int year, int month, int day) {

        if (isValidDate(year, month, day)) {

            this.setYear(year);
            this.setMonth(month);
            this.setDay(day);

        }

    }

    @Override
    public String toString() {

        return getDayOfWeek(year, month, day) + ", " + this.day + " " + MONTHS[month - 1] + " " + this.year;
    }

    @Override
    public boolean equals ( Object ob ){

        if ( this == ob ){
           
            return true;

        }

        if ( ob == null ){
            
            return false;

        }

        if ( getClass() != ob.getClass() ){
            
            return false;

        }

        MyDate date = (MyDate) ob;

        if ( this.day == date.getDay() && this.month == date.getMonth() && this.year == date.getYear() ){
            
            return true;

        }else{

            return false;

        }

    }

    @Override
    public MyDate clone() {

        return new MyDate(this.year, this.month, this.day);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(this.year, this.month, this.day);
    }

    public MyDate nextYear() {

        return new MyDate(this.year + 1, this.month, this.day);
    }

    public MyDate nextMonth() {

        if (this.day == 31 && month == 12) {

            return new MyDate(this.year + 1, 1, this.day);

        } else {

            if(isLeapYear(this.year) && this.day == DAYS_IN_MONTHS[0]){

                return new MyDate(this.year, 2, 29 );

            }else{

                if( this.month == 0 ){

                    return new MyDate(this.year, this.month + 1, 28 );

                }

            }

            if( this.day > DAYS_IN_MONTHS[month] ){

                return new MyDate(this.year, this.month + 1, DAYS_IN_MONTHS[month]);

            }

            return new MyDate(this.year, month + 1, this.day);

        }

    }

    public MyDate nextDay() {

        if (this.month == 12 && this.day == DAYS_IN_MONTHS[this.month-1]) {

            return new MyDate(this.year +1, 1, 1);

        } else {

            if ((this.day == DAYS_IN_MONTHS[month-1]) || (this.day == 29 && isLeapYear(this.year))){

                return new MyDate(this.year, this.month + 1, 1);

            }else{

                return new MyDate(this.year, this.month, this.day + 1);

            }

           
        }

    }

    public MyDate previousYear() {

        if(this.month == 2 && isLeapYear(this.year - 1) ){

            return new MyDate(this.year -1, this.month, 29);

        }

        if(this.month == 2){

            return new MyDate(this.year - 1, this.month, 28);

        }

        return new MyDate(this.year - 1, this.month, this.day);
    }

    public MyDate previousMonth() {

        if (this.month == 1) {

            return new MyDate(this.year - 1, 12, this.day);

        } else {

            if( this.day > DAYS_IN_MONTHS[month-2]){

                return new MyDate(this.year, this.month - 1, DAYS_IN_MONTHS[month - 2] );
    
            }else{

                return new MyDate(this.year, this.month - 1, this.day);

            }

        }

    }

    public MyDate previousDay() {

        if (this.day == 1 && this.month == 1) {

            return new MyDate(this.year - 1, 12, 31);

        }

        if (isLeapYear(this.year) && this.day == 1 && this.month == 3) {

            return new MyDate(this.year, month - 1, 29);

        } else {

            if (!isLeapYear(this.year) && this.month == 3) {

                return new MyDate(this.year, month - 1, 28);

            }

        }

        if (this.day == 1 && this.month == 3 || this.day == 1 && this.month == 5 || this.day == 1 && this.month == 7 || this.day == 1 && this.month == 8 || this.day == 1 && this.month == 10 || this.day == 1 && this.month == 12) {

            return new MyDate(this.year, month, 30);

        }

        if (this.day == 1 && this.month == 2 || this.day == 1 && this.month == 6 || this.day == 1 && this.month == 9
                || this.day == 1 && this.month == 11) {

            return new MyDate(this.year, this.month, 31);
        }

        if(this.month == 1){

            return new MyDate(this.year - 1, 12, this.day-1);

        }

        return new MyDate(this.year, this.month, this.day - 1);

    }

}
