package drawings;

public class Drawings {

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
