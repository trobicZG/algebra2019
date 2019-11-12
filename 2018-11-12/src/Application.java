import java.util.*;

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

        Person p1 = new Person("Sasa", "Fajkovic", 30);
        Person p2 = new Person("Maja", "Majic", 31);
        Person p3 = new Person("Sasa", "Fajkovic", 30);
        Person p4 = p2;

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);

    }
}
