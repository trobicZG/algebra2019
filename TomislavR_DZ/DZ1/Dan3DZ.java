public class Dan3DZ {
    public static void main(String[] args) {
        printRectangle(4,5,"*");
    }

    static void printRectangle(int height, int width, String whatToPrint) {
        for(int i=0; i<height; i++)
        {
            if (i == 0 || i == height-1) {
                for (int j=0; j<width; j++) {
                    System.out.print(whatToPrint);
                }
            }  else {
                for (int j=0; j<width; j++)
                    if (j == 0 || j == width-1) {
                        System.out.print(whatToPrint);
                    } else {
                        System.out.print(" ");
                    }
            }

            System.out.println();
        }
    }
}
