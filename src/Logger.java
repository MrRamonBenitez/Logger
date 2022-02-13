import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger instance;
    private final String currentDateAndTime;

    private Logger() {
        Date date = new Date();
        SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        this.currentDateAndTime = formatForDate.format(date);
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + currentDateAndTime + " " + num++ + "] " + msg);
    }

}
