public class ArrayExamples {
    public static void main(String[] args) {
        String[] strings = {"Audi", "BMW", "Mercedes", "Volvo"};

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]); // procitaj element na odredenom indexu
        }

        int[] ints = {1, 2, 3, 4, 5};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        int[] ints2 = new int[5]; // kreiramo prazno polje integera
        ints2[0] = 100;
        ints2[1] = 200;
        ints2[2] = 300;
        ints2[3] = 400;

        System.out.println("ints2[0]=" + ints2[0]);
        System.out.println("ints2[1]=" + ints2[1]);
        System.out.println("ints2[2]=" + ints2[2]);
        System.out.println("ints2[3]=" + ints2[3]);

        System.out.println("ints2[4]=" + ints2[4]);

    }
}
