public class Aufgabe7 {
    public static void main(String[] args) throws Exception {
        double[] arrayA = {1,2,3,4};
        double[] arrayB = {1,2,3,4};

        arrayA = changeOrder(arrayA);
        changeOrder2(arrayB);
    }

    public static double[] changeOrder(double[] input){
        double[] newArray = new double[input.length];
        for (int i = 0; i<input.length; i++){
            newArray[i] = input[input.length-i-1];
        }
        return newArray;
    }

    public static void changeOrder2(double[] input){
        for (int i = 0; i<input.length/2; i++){
            double tmp = input[i];
            input[input.length-1] = input[i];
            input[i] = tmp;
        }
    }
}
