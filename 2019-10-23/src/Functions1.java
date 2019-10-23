public class Functions1 {
    public static void main(String[] args) {

        String date = "2019-10-23";

        int month = getMonth(date);

        if (month > 6) {
            System.out.println("Proslo je pola godine.");
        } else {
            System.out.println("U prvoj polovici godine smo.");
        }

        boolean b1 = isEqual("algebra", "Algebra");
        boolean b2 = isEqual("algebra", "algebra");
        boolean b3 = isEqual("algebra ", "algebra");
        boolean b4 = isEqual(" algebra", "algebra");
        boolean b5 = isEqual(new String("algebra"), "algebra");

        String s1 = "Algebra";
        String s2 = "Algebra";

        boolean b10 = s1.equals(s2);
        boolean b11 = s2.equals(s1);
        boolean b12 = s1.equals("Algebra");
        boolean b13 = s2.equals("Algebra");
        boolean b14 = s1.equals(new String("Algebra"));
        boolean b15 = s2.equals(new String("Algebra"));

        String s3 = s2;
        boolean b20 = s1.equals(s2);
        boolean b21 = s1.equals(s3);
        s2 = "Nesto drugo";
        boolean b22 = s1.equals(s2);
        boolean b23 = s1.equals(s3);

        String s5 = "algebra";
        String s6 = "algebra";
        String s7 = s6;

        boolean b30 = s5 == s6;
        boolean b31 = s5 == s7;
        s6 = "Nesto drugo";
        boolean b32 = s5 == s6;
        boolean b33 = s5 == s7;
        boolean b34 = s5 == new String("algebra");

        printCharacters(20, "x");
        System.out.println();
        System.out.println();
        printCharacters(50, "*");
        System.out.println();
        printCharacters(100, "a");
    }

    static Integer getMonth(String date) {
        String[] arr = date.split("-");
        return Integer.parseInt(arr[1]);
    }

    static boolean isEqual(String first, String second) {
        if (first == second) {
            return true;
        }
        return false;
    }

    static void printCharacters(int howMany, String whatToPrint) {
        for (int i = 0; i < howMany; i++) {
            System.out.print(whatToPrint);
        }
    }

}
