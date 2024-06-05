package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String favoriteColor;
    public Person (){}
    public Person(String firstName, String lastName, int age, String address, String favoriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.favoriteColor = favoriteColor;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public int getAge(int age) {

        return this.age;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public String getAddress() {

        return this.address;
    }
    public void setAddress(String address) {

        this.address = address;
    }
    public String getFavoriteColor() {

        return this.favoriteColor;
    }
    public void setFavoriteColor(String favoriteColor) {

        this.favoriteColor = favoriteColor;
    }
}