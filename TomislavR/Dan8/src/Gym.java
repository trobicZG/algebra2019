import java.util.Scanner;

public class Gym {
    private int ID;
    private String workingHours;
    private String address;
    private String city;
    private String phoneNumber;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.ID + "," + this.workingHours + "," + this.address + "," + this.city + "," + this.phoneNumber;
    }

    public static Gym fromConsole() {
        Scanner scanner = new Scanner(System.in);
        Gym g = new Gym();

        System.out.println("Working hours: ");
        g.setWorkingHours(scanner.nextLine());

        System.out.println("Address: ");
        g.setAddress(scanner.nextLine());

        System.out.println("City: ");
        g.setCity(scanner.next());

        System.out.println("Phone: ");
        g.setPhoneNumber(scanner.next());

        return g;
    }

    public static Gym fromString(String input) {
        String[] values = input.split(",");
        Gym g = new Gym();
        g.setID((int) Long.parseLong(values[0]));
        g.setWorkingHours(values[1]);
        g.setAddress(values[2]);
        g.setCity(values[3]);
        g.setPhoneNumber(values[4]);

        return g;
    }

}
