package com.example.fix_label;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

/**
 * Created by phil on 4/12/15.
 */
public class exercise {
    private int e_id;
    private int w_id;
    private String e_title;
    private int _sets;
    private int _reps;
    private double _weight;
    private double _pace;
    private double _duration;
    private String e_date;
    private String _type; //must be type w, bw, or c


    public exercise() {
        this.e_title = "0";
        this._sets = -1;
        this._reps = -1;
        this._weight = -1.0;
        this._pace = -1.0;
        this._duration =-1.0;
        this._type = "w";
        this.e_date = new SimpleDateFormat("MMM dd yyyy").format(Calendar.getInstance().getTime());
    }
/*
    public void exercise_weights(int id, String title) { //call if type is weight
        this.e_id = e_id;
        this.w_id = w_id;
        this.e_title = title;
        this.e_date = DateFormat.getDateInstance(DateFormat.MEDIUM);
    }
*/


    public void set_eID(int id) {
        this.e_id = id;
    }

    public int get_eID() {
        return this.e_id;
    }


    public void set_wID(int id) {
        this.w_id = id;
    }

    public int get_wID() {
        return this.w_id;
    }

    public void set_title(String title) {
        this.e_title = title;
    }

    public String get_title() {
        return this.e_title;
    }

    public void set_reps(int reps) {
        this._reps = reps;
    }

    public int get_reps() {
        return this._reps;
    }

    public void set_sets(int sets) {
        this._sets = sets;
    }

    public int get_sets() {
        return this._sets;
    }


    public void set_weight(double weight) {
        this._weight = weight;
    }

    public double get_weight() {
        return this._weight;
    }

    public void set_pace(double pace) {
        this._pace = pace;
    }

    public double get_pace() {
        return this._pace;
    }

    public void set_duration(double duration) {
        this._duration = duration;
    }

    public double get_duration() {
        return this._duration;
    }
    public void setDate() {
        this.e_date = new SimpleDateFormat("MMM dd yyyy").format(Calendar.getInstance().getTime());
    }

    public String get_date() {
        return this.e_date;
    }

    public void set_type(String type) {
        this._type = type;
    }

    public String get_type() {
        return this._type;
    }



}
