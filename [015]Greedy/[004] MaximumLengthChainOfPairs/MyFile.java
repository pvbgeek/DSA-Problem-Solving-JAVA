import java.util.Arrays;
import java.util.Comparator;

public class MyFile 
{

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 6 }, { 5, 28 }, { 27, 4 }, { 50, 9 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int ans = 1;
        int pairEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairEnd < pairs[i][0]) {
                ans++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("Max Length Chain of Pairs: " + ans);
    }
}