public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public int sum(double[] aa) {
        double sum = 0.0;
        for (int i =0; i < aa.length; i++){
            sum+=aa[i];
        }
        return (int) sum;
    }

    public int average(double[] aa) {
       double ave = 0;
        for (int i =0; i < aa.length; i++){
            ave = sum(aa) / aa.length;
        }
        return (int) ave;
    }

}
