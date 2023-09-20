import java.util.*;
public class MyFile
{

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 590;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int countOfCoins = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.print("total (min) coins using: " + countOfCoins + " ( ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println(")");
    }
}