public class Car extends Vehicle {
    private Integer doorsCount; // broj vrata
    private boolean isCabrio;

    public Integer getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(Integer doorsCount) {
        this.doorsCount = doorsCount;
    }

    public boolean isCabrio() {
        return isCabrio;
    }

    public void setIsCabrio(boolean cabrio) {
        isCabrio = cabrio;
    }
}
