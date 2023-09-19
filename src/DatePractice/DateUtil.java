package DatePractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtil {

    static void findTimeDifference(String formattedDate, String statusUpdateTime) throws ParseException {

       SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MM hh:mm:ss");

       Date d1 = sdf.parse(formattedDate);
       Date d2 = sdf.parse(statusUpdateTime);

       Long diffInTime = d1.getTime() - d2.getTime();

       Long diffInSecond = TimeUnit.MILLISECONDS.toSeconds(diffInTime) % 60 ;
       Long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(diffInTime)% 60;
       Long diffInHour = TimeUnit.MILLISECONDS.toHours(diffInTime)% 24;
       Long diffInDays = TimeUnit.MILLISECONDS.toDays(diffInTime)% 365;
       Long diffInYears = TimeUnit.MILLISECONDS.toDays(diffInTime)% 3651;


       System.out.println("Last status was updated ::" + diffInSecond + " seconds, " + diffInMinutes + " minutes, " + diffInHour + " hours, " +diffInDays+ " days, " +diffInYears+ " years ago");


    }

    public static void main(String[] args) throws ParseException {
        String statusUpdateTime = "Mon 18 09 06:00:00";
        LocalDateTime localtimeNow = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE dd MM hh:mm:ss");
        String formattedDate = formatter.format(localtimeNow);
        System.out.println("Local Time Now:: " +formattedDate);
        System.out.println("Status updated Time:: " +statusUpdateTime);

        findTimeDifference(formattedDate,statusUpdateTime );


    }



}
