import com.sun.javaws.IconUtil;

import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Person p1 = new Person("Sasa","Fajkovic", 30);
        Person p2 = new Person("Maja","Maric", 28);

        if (p1.compareTo(p2) < 0) {
            System.out.println(p1.getName() + " is younger than " + p2.getName());
        }
        else if (p1.compareTo(p2) > 0) {
            System.out.println(p1.getName() + " is older than " + p2.getName());
        }
        else {
            System.out.println(p1.getName() + " have same age as" + p2.getName());
        }

    }
}
