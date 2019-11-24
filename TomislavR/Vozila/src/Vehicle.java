public class Vehicle implements Comparable<Vehicle> {
    String manufacturer;
    String model;
    int age;
    double powerKW;

    public Vehicle(String manufacturer, String model, int age, double powerKW) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.age = age;
        this.powerKW = powerKW;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int yearOfManufacture) {
        this.age = yearOfManufacture;
    }

    public double getPowerKW() {
        return powerKW;
    }

    public void setPowerKW(double powerKW) {
        this.powerKW = powerKW;
    }

    @Override
    public int compareTo(Vehicle o) {
        if (this.age > o.age) {
            return 1;
        }

        if (this.age < o.age) {
            return -1;
        }

        return 0;
    }
}
