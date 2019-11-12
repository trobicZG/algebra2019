import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);

        Collections.sort(arrayList);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);

        Person p1 = new Person("Sasa", "Fajkovic", 300);
        Person p2 = new Person("Maja", "Majic", 31);
        Person p3 = new Person("Sasa", "Fajkovic", 30);
        Person p4 = p2;
        p4.setAge(30);

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);

        if (p1.compareTo(p2) < 0) {
            System.out.println(p1.getFirstName() + " is younger then " + p2.getFirstName());
        } else if (p1.compareTo(p2) == 0) {
            System.out.println(p1.getFirstName() + " has the same age as " + p2.getFirstName());
        } else {
            System.out.println(p1.getFirstName() + " is older then " + p2.getFirstName());
        }

    }
}
