import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Long.*;

public class TestJson {

    public static void main(String[] args) {
        String jSonDate = "/Date(1635896019979+0000)/";
        String  sNumber = jSonDate.substring(6, jSonDate.lastIndexOf("+"));
        //long iNumber = sNumber * 1;
       // String oDate = new String(sNumber);

       // Date date = new Date(Long.parseLong(sNumber));
        long datetimestamp = parseLong(sNumber);
       // long datetimestamp = Integer.parseInt(sNumber);
 Date date = new Date(datetimestamp);
 DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS");
 String dateFormatted = formatter.format(date);
        System.out.println(dateFormatted);

    }
}
