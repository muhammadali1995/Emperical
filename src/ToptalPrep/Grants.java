package ToptalPrep;

public class Grants {
    public static void main(String[] args) {
        Grants grants = new Grants();
        System.out.println(grants.findGrantsCap(new double[]{2, 100, 50, 120, 167}));
    }
     double findGrantsCap(double[] grantsArray) {
        // your code goes here


        double sumOfGLessAvg = 0;
        int count = 0;

        double avg = (double) 400 /grantsArray.length;


        // count != prevCount  = -1

        int prevCount = -1;

        while(prevCount!=count) {
            sumOfGLessAvg = 0;
            prevCount = count;
            count = 0;
            for(double a: grantsArray) {
                if(a<avg) {
                    sumOfGLessAvg +=a;
                    count++;
                }

            }





            //100+50+2
            //400-152 = 248 / 2 = 128

            avg =  ((double) 400 -sumOfGLessAvg)/(grantsArray.length-count); //116
        }
        return avg;
     }
}
