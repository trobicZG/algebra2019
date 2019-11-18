package gym.model;

import gym.constants.ApplicationConstants;

public class Member {

    private Integer id;
    private String firstName;
    private String lastName;
    private String oib;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    @Override
    public String toString() {
        return this.getId() + ApplicationConstants.DATA_SEPARATOR +
                this.getFirstName() + ApplicationConstants.DATA_SEPARATOR +
                this.getLastName() + ApplicationConstants.DATA_SEPARATOR +
                this.getOib();
    }
}
