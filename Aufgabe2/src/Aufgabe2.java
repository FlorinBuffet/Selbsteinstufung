public class Aufgabe2 {
    public static void main(String[] args) {
        for(int col = 1; col <= 3; col++){
            for (int row = 1; row <= 3; row++) {
                if ((row+col)%2==0)
                    System.out.print("blue ");
                else
                    System.out.print("red ");
            }
            System.out.println();
        }
    }
}