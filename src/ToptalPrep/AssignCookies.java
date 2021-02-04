package ToptalPrep;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        for (int k : s) {
            if (j < g.length && k >= g[j]) j++;
        }

        return j;
    }
}
