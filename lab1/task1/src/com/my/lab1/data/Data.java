package com.my.lab1.data;

import java.util.Date;

public class Data{
    private String surname;
    private String currentDate;

    public Data(){
        surname = "Default Surname";
        currentDate = new Date().toString();
    }

    public void setSurname(String surname){
        this.surname = surname;
        currentDate = new Date().toString();
    }

    public void updateCurrentDate(){
        currentDate = new Date().toString();
    }

    public String getSurname(){ return surname; }

    public String getCurrentDate(){ return currentDate; }
}