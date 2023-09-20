import java.util.*;

public class MyFile 
{
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVar[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVar, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVar.length) {
            if (costVar[v] <= costHor[h]) { // horizonal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { // vertical cut
                cost += (costVar[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVar.length) {
            cost += (costVar[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = " + cost);
    }
}