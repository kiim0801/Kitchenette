package com.example.navigationdrawerfromscratch.account;

import com.example.navigationdrawerfromscratch.lebensmittel.Food;

import java.util.List;

public class User {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String mail;
    private List<String> allergies;
    private List<String> favorites;
    private List<String> shoppingList;

    public User (String firstname, String lastname, String username, String password, String mail, List<String> allergies, List<String> favorites, List<String> shoppingList) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.allergies = allergies;
        this.favorites = favorites;
        this.shoppingList = shoppingList;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", allergies=" + allergies +
                ", favorites=" + favorites +
                ", shoppingList=" + shoppingList +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<String> shoppingList) {
        this.shoppingList = shoppingList;
    }
}
