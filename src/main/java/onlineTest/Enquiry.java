package onlineTest;
// -2
public class Enquiry  extends Customer{
    private String address1;
    public void displayDetails(){
        System.out.println(this.toString());
    }

    public static void main(String args[]){
        new Enquiry().displayDetails();
    }
}

class Customer{
    private String name;
    private String city;

    public Customer() {
    }

    public Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
