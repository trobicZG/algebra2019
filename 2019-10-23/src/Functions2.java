public class Functions2 {
    public static void main(String[] args) {

        drawRectagle(5,2,'x');
        System.out.println();
        drawRectagle(5,20,'a');
        System.out.println();
        drawRectagle(10,50,'*');

    }

    static void drawRectagle(int height, int width, char c) {
        for (int i = 0; i<height; i++) {
            for (int j = 0; j<width; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
