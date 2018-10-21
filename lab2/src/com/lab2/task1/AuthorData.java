package com.lab2.task1;
import java.util.Date;

public class AuthorData {
    private String curDate;
    private String authorSurname;

    public AuthorData(String surname){
        this.authorSurname = surname;
        this.curDate = new Date().toString();
    }

    /**
     * @return current date
     */
    public String getCurDate(){ return this.curDate; }

    /**
     * @return authors surname
     */
    public String getAuthorSurname() { return this.authorSurname; }
}
