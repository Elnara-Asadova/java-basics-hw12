import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int result = Arrays.stream(numbers)
                .filter(x-> x%2==0)
                .map(x-> x*x)
                .sum();
        return result;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        int [] result = Arrays.stream(numbers)
                .filter(x-> x%2==1 || x%2==-1)
                .sorted()
                .toArray();
        return result;
    }
}
