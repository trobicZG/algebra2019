public class Vehicle implements Comparable<Vehicle> {

    private String manufacturer;
    private String model;
    private int yearOfManufacturing;
    private float kw;

    public Vehicle(String manufacturer, String model, int yearOfManufacturing, float kw) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.kw = kw;
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

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public float getKw() {
        return kw;
    }

    public void setKw(float kw) {
        this.kw = kw;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", kw=" + kw +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        if (this.yearOfManufacturing < o.yearOfManufacturing) {
            return -1;
        }

        if (this.yearOfManufacturing > o.yearOfManufacturing) {
            return 1;
        }
        return 0;
    }
}
