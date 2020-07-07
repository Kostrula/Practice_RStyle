package ru.softlab.galkin.onlinebank.model;

public class User {
    private Long id;
    private String login;
    private String password;
    private String sirName;
    private String firstName;

    public void setId(Long id){
        this.id = id;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setSirName(String sirName){
        this.sirName = sirName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public Long getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }

    public String getSirName() {
        return sirName;
    }

    public String getFirstName(){
        return firstName;
    }
}
