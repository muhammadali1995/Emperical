package Solutions.codility;

import java.util.Arrays;

public class DNA {
    public static void main(String[] args) {
        DNA dna = new DNA();
        System.out.println(Arrays.toString(dna.solution("G", new int[]{0, 0, 0}, new int[]{0, 0, 0})));
    }
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int k = 0;
        for (int i = 0; i < P.length; i++) {
            char minC = 'T';
            for (int j = Math.min(P[i], Q[i]); j <=Math.max(P[i], Q[i]); j++) {
                if ((int) S.charAt(j) < (int) minC) {
                    minC = S.charAt(j);
                }
            }

            if (minC == 'A') {
                result[k] = 1;
            } else if (minC == 'C') {
                result[k] = 2;
            } else if (minC == 'G') {
                result[k] = 3;
            } else {
                result[k] = 4;
            }
            k++;
        }

        return result;
    }
}
