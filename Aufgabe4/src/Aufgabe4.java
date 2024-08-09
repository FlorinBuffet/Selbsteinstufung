public class Aufgabe4 {
    public static void main(String[] args) throws Exception {
        int array1[] = {3,2,7,6,8,6,3,4,1};
        int array2[] = {6,8,6};
        int array3[] = {8,6,6};
        System.out.println(contains(array1,array2));
        System.out.println(contains(array1,array3));
    }

    private static boolean contains(int[] arr1, int[] arr2){
        int dp = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i]==arr2[dp])
                dp++;
            else
                dp = 0;
            if (dp == arr2.length)
                return true;
        }
        return false;
    }
}
