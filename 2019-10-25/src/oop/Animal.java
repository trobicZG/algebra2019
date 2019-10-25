package oop;

public abstract class Animal {
    private String color;
    private Double speed;
    private int legsCount;
    private int teethCount;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }
}
