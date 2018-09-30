package com.my.lab1;

import java.util.Date;

public class Data{
    private String surname;
    private String currentDate;

    public Data(){
        this.surname = "Default";
        this.currentDate = new Date().toString();
    }

    public void setSurname(String surname){
        this.surname = surname;
        this.currentDate = new Date().toString();
    }

    public void updateCurrentDate(){
        this.currentDate = new Date().toString();
    }

    public String getSurname(){ return this.surname; }

    public String getCurrentDate(){ return this.currentDate; }
}