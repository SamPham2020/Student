/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Hong Hien Pham
 */
public class Address {
    private String aptNum;
    private String streetNum;
    private String streetName;
    private String city;
    private String province;
    private String zipcode;

    //Default constructor
    public Address() {
        this.aptNum = null;
        this.streetNum = null;
        this.streetName = null;
        this.city = null;
        this.province = null;
        this.zipcode = null;
    }
    
    /**
     * Constructor with 6 parameters 
     * @param aptNum: the apartment number of an address 
     * @param streetNum: street number ''
     * @param streetName of an address
     * @param city ""
     * @param province ""
     * @param zipcode ""
     */
    public Address(String aptNum, String streetNum, String streetName, 
            String city, String province, String zipcode) {
        this.aptNum = aptNum;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
    }
    
    /**
     * Copy constructor: copy all data of an address to another 
     * @param address: an object of Address to be copied 
     */
    public Address(Address address) {
        this.aptNum = address.aptNum;
        this.streetNum = address.streetNum;
        this.streetName = address.streetName;
        this.city = address.city;
        this.province = address.province;
        this.zipcode = address.zipcode;
    }
    /**
     * To check if a zip code is following the valid pattern  ("A1A 1A1")
     * @param zipCode the zipcode you want to check,
     * @return if a zip code is following the valid pattern
     */
    public boolean isZipCodeValid(String zipCode) {
        if (zipCode.length() != 7)
            return false;
        
        for (int i = 0; i < zipCode.length(); i++) {
            if ((i == 0 || i == 2 || i == 5) && !Character.isLetter(zipCode.charAt(i)))
                return false;
            if ((i == 1 || i == 4 || i == 6) && !Character.isDigit(zipCode.charAt(i)))
                return false;
        }
        return zipCode.charAt(3) == ' ';
//        return Character.isLetter(zipCode.charAt(0)) &&
//                Character.isDigit(zipCode.charAt(1)) &&
//                Character.isLetter(zipCode.charAt(2)) &&
//                Character.isWhitespace(zipCode.charAt(3)) &&
//                Character.isDigit(zipCode.charAt(4)) &&
//                Character.isLetter(zipCode.charAt(5)) &&
//                Character.isDigit(zipCode.charAt(6));
    }
    
    public boolean equals(Address address) {
        return this.aptNum.equals(address.aptNum) &&
                this.streetNum.equals(address.streetNum) &&
                this.streetName.equals(address.streetName) &&
                this.city.equals(address.city) &&
                this.province.equals(address.province) &&
                this.zipcode.equals(address.zipcode);
    }

    @Override
    public String toString() {
        String str = "";
        str += String.format("%s, %s %s\n", aptNum, streetNum, streetName);
        str += String.format("%12s%s %s, %s", "", city, province, zipcode);
        
        return str;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        if (isZipCodeValid(zipcode))
            this.zipcode = zipcode;
        else
            System.out.printf("%s is not a valid zipcode", zipcode);
    }   
    
}
