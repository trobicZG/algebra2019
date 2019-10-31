public class Car extends Vehicle {
    private Integer doorsCount;

    public boolean isCabrio() {
        return isCabrio;
    }

    public void setIsCabrio(boolean cabrio) {
        isCabrio = cabrio;
    }

    private boolean isCabrio;

    public Integer getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(Integer doorsCount) {
        this.doorsCount = doorsCount;
    }

    @Override
    public void honk(int howManySeconds) {
        for (int i = 0; i < howManySeconds*10; i++ )
            System.out.println("Car is using horn!");
    }

}
