package com.example.fix_label;

import java.util.Calendar;

/**
 * Created by phil on 4/12/15.
 */
public class workout {

    private int _id;
    private String _title;
    private String _date;

    public workout() {

    }

    public workout(int id, String title) {
        this._id = id;
        this._title = title;
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int year = c.get(Calendar.YEAR);
        String date = month + "/" + day + "/" + year;
        this._date =  date;
    }



    public void setID(int id) {
        this._id = id;
    }

    public int getID() {
        return this._id;
    }

    public void setworkoutTitle(String title) {
        this._title = title;
    }

    public String getworkoutTitle() {
        return this._title;
    }

    public void setDate() {
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int year = c.get(Calendar.YEAR);
        String date = month + "/" + day + "/" + year;
        this._date =  date;
    }

    public String get_date() { //need to convert date to string format
        return this._date;
    }




}
