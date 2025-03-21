public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;

    public Customer(int id, String firstName, String lastName, String email, boolean isLoyalCustomer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoyalCustomer(boolean isLoyalCustomer) {
        this.isLoyalCustomer = isLoyalCustomer;
    }

    public int GetId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}