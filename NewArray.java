public class NewArray {
    public static void main(String[] args) {
        System.out.println("what to do better in life");
        System.out.println("it working solution");

        int[][][] array3D = {
            { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20} },
            { {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40} },
            { {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}, {51, 52, 53, 54, 55}, {56, 57, 58, 59, 60} }
        };

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < 4; j++) {
                for (int z = 0; z < 5; z++) {
                    System.out.print(array3D[i][j][z]);
                    
                }
                System.out.println("");
                System.out.println(" ");
                
            }
        }
    }
}
