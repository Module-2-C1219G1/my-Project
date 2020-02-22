public class Phone {
    private String name = "Empty";
    private String phoneNumber = "Empty";


    public Phone() {
    }

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                " Phone Number: " + this.phoneNumber;
    }
}

