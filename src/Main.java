import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
           /* Scanner scanner = new Scanner(System.in);
               int num;
               int sum = 0;
               System.out.printf("Please enter 5 integer : %n");
        for(int i =0 ; i<5; i++){
            num = scanner.nextInt();
            sum = sum + num;
        }

                    System.out.printf("Total is :  %d", sum);
        System.out.println();
        */



        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern( pattern:"dd/MM/yyyy HH:mm:ss");

        // SimpleDateFormat formattter = new SimpleDateFormat("dd:MM:yyyy -w HH:mm:ss:SS a");
        // HH: give 24 hrs format  and hh give 12 hrs format
        // w for week number
//        Date date = new Date();
//        System.out.println(formattter.format(date));
//        System.out.println(java.time.LocalDate.now());
//        System.out.println(LocalTime.now());



        // REGEX
       /* Pattern pattern = Pattern.compile("a?");
        Matcher matcher = pattern.matcher("aaa");
        boolean b = matcher.matches();

        System.out.println(b); */



    }
}
