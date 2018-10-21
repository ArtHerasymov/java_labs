package com.lab2.task1;
import java.util.Date;

public class AuthorData {
    private String curDate;
    private String authorSurname;

    public AuthorData(String surname){
        this.authorSurname = surname;
        this.curDate = new Date().toString();
    }

    public String getCurDate(){ return this.curDate; }
    public String getAuthorSurname() { return this.authorSurname; }
}
