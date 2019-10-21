import java.util.Scanner;

public class StudentGrades {

//    Napisati program koji ispisuje ocjenu studenta ovisno o tome koliko posto ispita je riješio,
//    ako je riješio 90%  ili više od 90% dobiva 5 (izvrstan),
//    ako je riješio 80% ili više od 80% dobiva 4 (vrlo dobar),
//    ako je riješio 70% ili više od 70% dobiva 3 (dobar),
//    ako je riješio 60% ili više od 60% dobiva 2 (dovoljan),
//    a ako je riješio manje od 60% dobiva ocijenu1(nedovoljan).
//
//    I na kraju se ispisuje koju je ocjenu dobio student.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentage = scanner.nextInt();

        if (percentage >= 90) {
            System.out.println("Izvrstan");
        } else if (percentage >= 80) {
            System.out.println("Vrlo dobar");
        } else if (percentage >= 70) {
            System.out.println("Dobar");
        } else if (percentage >= 60) {
            System.out.println("Dovoljan");
        } else {
            System.out.println("Nedovoljan");
        }
    }
}
