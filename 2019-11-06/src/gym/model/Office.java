package gym.model;

import gym.constants.ApplicationConstants;

public class Office {
    private Integer id;
    private String workingHours;
    private String address;
    private String city;
    private String contactNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return this.getId() + ApplicationConstants.DATA_SEPARATOR +
                this.getCity() + ApplicationConstants.DATA_SEPARATOR +
                this.getAddress() + ApplicationConstants.DATA_SEPARATOR +
                this.getWorkingHours() + ApplicationConstants.DATA_SEPARATOR +
                this.getContactNumber();
    }
}
