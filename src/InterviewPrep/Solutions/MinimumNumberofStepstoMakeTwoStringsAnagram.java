package InterviewPrep.Solutions;

public class MinimumNumberofStepstoMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        if (s == null || t == null || s.isEmpty() || s.equals(t))
            return 0;
        int numberOfSteps = 0;
        int[] counter = new int[256];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)]++;
        }
        for (int i = 0; i <t.length() ; i++) {
            counter[t.charAt(i)]--;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                numberOfSteps += counter[i];
            }
        }
        return numberOfSteps;
    }
}
