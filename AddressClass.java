public class AddressClass {

    private String name;
    private String street;
    private String city;
    private String state;
    private int zipcode;


    public AddressClass(String name ,String street, String city, String state, int zipcode){
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString(){

        return  name + " " + street + " " + city + ", " + state + " " + zipcode;
    }


}
