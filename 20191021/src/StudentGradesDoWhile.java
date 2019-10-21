import java.util.Scanner;

public class StudentGradesDoWhile {
    //
//    Napisati program koji ispisuje tekstualni naziv ocjene.
//    Program pita korisnika beskonacno puta za ocjenu, sve dok korisnik ne unese 0 koja oznacava kraj.
//
//    Ako unese bilo koji broj van dopustenog raspona treba mu ispisati poruku o nevaljanom unosu.
    public static void main(String[] args) {

        final int VALUE_TO_EXIT_APPLICATION = 0;

        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        do {
            System.out.println("Unesi ocjenu: ");
            grade = scanner.nextInt();

            switch (grade) {
                case 0:
                    System.out.println("Izlazim iz aplikacije!");
                    break;
                case 1:
                    System.out.println("Nedovoljan");
                    break;
                case 2:
                    System.out.println("Dovoljan");
                    break;
                case 3:
                    System.out.println("Dobar");
                    break;
                case 4:
                    System.out.println("Vrlo dobar");
                    break;
                case 5:
                    System.out.println("Odlican");
                    break;
                default:
                    System.out.println("Neispravan unos!");
            }

        } while (grade != VALUE_TO_EXIT_APPLICATION);
    }
}
