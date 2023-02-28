public class Address {
    // Data
    private String unitNo;
    private String street;
    private String postcode;
    private String district;
    private String state;
    private String country;

    // Constructor with setter
    public Address(String unitNo, String street, String postcode, String district, String state, String country){
        this.unitNo = unitNo;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
        this.country = country;
    }

    // Getter
    public String getUnitNo(){
        return unitNo;
    }

    public String getStreet(){
        return street;
    }
    public String getPostcode(){
        return postcode;
    }
    public String getDistrict(){
        return district;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
}
