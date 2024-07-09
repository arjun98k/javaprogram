public class TwoDarrays {
    public static void main(String[] args) {
        int marks [][] = {{11,22,14},{87,45,77},{35,76,90}};
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(marks[i][j]);
            }
            System.out.println("");
        } 
    }
}
