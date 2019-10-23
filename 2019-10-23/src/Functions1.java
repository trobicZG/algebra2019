public class Functions1 {
    public static void main(String[] args) {

        String date = "2019-10-23";

        if (getMonth(date).equals("10")) {
            System.out.println("Listopad");
        } else {
            System.out.println("Nije listopad");
        }

    }

    static String getMonth(String date) {
        String[] arr = date.split("-");
        return arr[1];
    }

}
