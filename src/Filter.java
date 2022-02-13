import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int passCounter = 0;
        String msg;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int tempElement : source) {
            if (tempElement < treshold) {
                msg = String.format("Element \"%d\" does not pass", tempElement);
                logger.log(msg);
            } else {
                msg = String.format("Element \"%d\" passes", tempElement);
                logger.log(msg);
                result.add(tempElement);
                passCounter++;
            }
        }
        msg = String.format("Passed filter %d items out of %d", passCounter, source.size());
        logger.log(msg);
        return result;
    }
}
