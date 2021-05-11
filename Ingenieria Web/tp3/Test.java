

public class Test {

    public static void main(String[] args) {
        
        int day = 30, month = 07, year = 2021;
        int day2 = 21, month2 = 05, year2 = 2016;
        int day3 = 32, month3 = 13, year3 = 10000;
        int day4 = 31, month4 = 01, year4 = 1999;
        int day5 = 31, month5 = 12, year5 = 2024;

        System.out.println( "Date: " );
        MyDate date = new MyDate(year, month, day);
        System.out.println( date );

        System.out.println( "Leap year: " );
        System.out.println( MyDate.isLeapYear(year2) );
        System.out.println( MyDate.isLeapYear(year) );

        System.out.println( "Valid date: " );
        System.out.println( MyDate.isValidDate(year2, month2, day2) );
        System.out.println( MyDate.isValidDate(year3, month3, day3) );

        System.out.println( "Get day of the week: " );
        System.out.println( MyDate.getDayOfWeek(year4, month4, day4) );

        
        try {
            System.out.println( "Set date" );
        date.setDate(year5, month5, day5);
        System.out.println( date );
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println( "Next: " );
        System.out.println( date.nextDay() );
        System.out.println( date.nextMonth() );
        System.out.println( date.nextYear() );

        System.out.println( "Previous: " );
        System.out.println( date.previousDay() );
        System.out.println( date.previousMonth() );
        System.out.println( date.previousYear() );

        System.out.println( "Setting" );
        date.setDay(day4);
        date.setMonth(month4);
        date.setYear(year4);

        System.out.println( "Get: " );
        System.out.println( date.getDay() );
        System.out.println( date.getMonth() );
        System.out.println( date.getYear() );

        System.out.println( "Hashcode: " );
        MyDate date2 = new MyDate(year5, month5, day5);
        System.out.println( date.hashCode() );
        System.out.println( date.hashCode() );
        date.setYear(year);
        System.out.println( date.hashCode() );
        System.out.println( date2.hashCode() );

        System.out.println( "Clone: " );
        date2 = date.clone();

        System.out.println( date );
        System.out.println( date2 );
        System.out.println( date.equals(date2) );
    }

}
