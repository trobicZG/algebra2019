public class ArraysMultiLevel {

    public static void main(String[] args) {
        int[][] multiArray = new int[5][2];

        multiArray[0][0] = 0;
        multiArray[0][1] = 1;

        multiArray[1][0] = 2;
        multiArray[1][1] = 3;

        multiArray[2][0] = 4;
        multiArray[2][1] = 5;

        System.out.println(multiArray[2][1]);
    }
}
