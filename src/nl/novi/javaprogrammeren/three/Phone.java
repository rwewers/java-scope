package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getInternationalPhoneNumber(Phone phone) {
        String phoneNumber = "+31" + phone.getPhoneNumber();


        return phoneNumber;
    }
}
