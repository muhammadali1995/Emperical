import DataStructure.vector.Test;
import Solutions.ListNode;
import Solutions.array.RotateArrayK;
import Solutions.array.SortArray;
import Solutions.binary.PowerOfTwo;
import Solutions.linkedList.IntersectionOfTwoLinkedLists;
import Solutions.linkedList.SwapNodePairs;
import Solutions.string.RepeatedDNASequences;
import Solutions.string.ReverseString;
import Solutions.string.StringToInteger;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by User on 6/21/2018.
 */
public class Test1 {

    public static void main(String[] args) {

        SortArray array = new SortArray();
        System.out.println(Arrays.toString(array.sortArray(new int[]{1, 2, 4, 3, 5, 7, 2})));
    }


    int isOnionArray(int a[]) {


        /*
         * if the array contains one or zero number of elements, it is always true
         * */
        if (a.length <= 1) {
            return 1;
        }

        for (int i = 0; i < a.length / 2; i++) {
            int sum = a[i] + a[a.length - i - 1];
            if (sum > 10) {
                return 0;
            }
        }
        return 1;
    }

    int sameNumberOfFactors(int n1, int n2) {

        if (n1 < 0 || n2 < 0) {
            return -1;
        }

        /*
         * if one the number is a factor of another, then they dont have equal number of factors
         *
         * */


        if (n1 != n2 && (n1 % n2 == 0 || n2 % n1 == 0)) {
            return 0;
        }
        /*
         * if two number are equal, they have the same number of factors
         * */
        if (n1 == n2) {
            return 1;
        }

        int factorsN1 = 0;
        int factorsN2 = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                factorsN1++;
            }
        }

        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                factorsN2++;
            }
        }

        if (factorsN1 == factorsN2) {
            return 1;
        } else {
            return 0;
        }

    }


    int hasNValues(int[] a, int n) {
        if (a.length < n) {
            return 0;
        }
        int tempArr[] = new int[n];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            boolean alreadyExists = false;
            for (int j = 0; j < count; j++) {
                if (tempArr[j] == a[i]) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                if (count == n) {
                    return 0;
                }
                tempArr[count] = a[i];
                count++;
            }
        }

        if (count == n) {
            return 1;
        } else {
            return 0;
        }

    }

}
