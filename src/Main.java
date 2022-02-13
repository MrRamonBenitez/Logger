import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        int listElelement;

        logger.log("We start the program");
        logger.log("Asking the user to enter input for the list");

        logger.log("Enter list size:");
        int N = scanner.nextInt();

        logger.log("Enter an upper bound for the values:");
        int M = scanner.nextInt();

        logger.log("Create and populate a list");
        for (int i = 0; i < N; i++) {
            listElelement = random.nextInt(M);
            if (listElelement > 0) {
                integerList.add(listElelement);
            }
        }

        String resultString = integerList
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        logger.log("Received list:" + resultString);

        logger.log("Asking the user to enter input for filtering");
        logger.log("Enter the threshold for the filter:");
        int f = scanner.nextInt();

        logger.log("Start filtering");
        Filter filter = new Filter(f);
        List<Integer> resultList = filter.filterOut(integerList);

        logger.log("Displaying the result on the screen");
        String filteredList = resultList
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        logger.log("Received list:" + filteredList);

        logger.log("We complete the program");
    }
}
