import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;
public class Q6 {
    public static void main(String args[])
    {
        Date thisdate=new Date();
        SimpleDateFormat dateForm=new SimpleDateFormat("d/M/y hh:MM:S a");
        System.out.println(dateForm.format(thisdate));

    }
}
