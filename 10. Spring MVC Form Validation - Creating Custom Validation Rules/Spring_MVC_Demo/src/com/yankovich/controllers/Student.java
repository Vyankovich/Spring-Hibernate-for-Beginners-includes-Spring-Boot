package com.yankovich.controllers;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String programmingLanguage;
    private String[] operatingSystems;

    //private LinkedHashMap<String, String> countryOptions;

    public Student() {
        // populate country options: used iso country code
//        countryOptions = new LinkedHashMap<>();
//
//        countryOptions.put("BR", "Brazil"); // key/code - value/label
//        countryOptions.put("PL", "Poland");
//        countryOptions.put("DE", "Germany");
//        countryOptions.put("FR", "France");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
