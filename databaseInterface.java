package com.example.fix_label;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by phil on 4/12/15.
 */

public class databaseInterface extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Maxout2.db";
    private static final String TABLE_WORKOUTS = "workouts";
    private static final String TABLE_EXERCISES = "exercises";

    //columns for workout table
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_W_NAME = "w_name";
    public static final String COLUMN_W_DATE= "w_date";

    //columns for exercises table
    public static final String COLUMN_E_ID = "e_ID";
    public static final String COLUMN_W_ID = "w_ID";
    public static final String COLUMN_SETS = "sets";
    public static final String COLUMN_REPS = "reps";
    public static final String COLUMN_WEIGHT_USED = "weight_used";
    public static final String COLUMN_PACE = "pace";
    public static final String COLUMN_DURATION = "duration";
    public static final String COLUMN_E_DATE= "e_date";
    public static final String COLUMN_TYPE = "type";

    public databaseInterface(Context context, String name,
                             SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    /*
        public dbAdapter open() throws SQLException
        {
            SQLiteDatabase db = SQLiteDatabase.openDatabase();
            return this;
        }*/

    public void addExercise(exercise my_exercise){
        //need to take in values from text fields at time of button press, then generate exercise object using the values
        //then push the new exercise into the database
        //how do i get the values from the corresponding text field....
        ContentValues values = new ContentValues();
        values.put(COLUMN_SETS, my_exercise.get_title());
        values.put(COLUMN_REPS, my_exercise.get_reps());
        values.put(COLUMN_WEIGHT_USED, my_exercise.get_weight());
        values.put(COLUMN_PACE, my_exercise.get_pace());
        values.put(COLUMN_DURATION, my_exercise.get_duration());
        values.put(COLUMN_TYPE, my_exercise.get_type());
        values.put(COLUMN_E_DATE, my_exercise.get_date());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_WORKOUTS, null, values);
        db.close();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {



        String CREATE_WORKOUT_TABLE = "CREATE TABLE workouts (ID INTEGER PRIMARY KEY " +
                "AUTOINCREMENT NOT NULL UNIQUE, w_name STRING NOT NULL, w_date DATE NOT NULL);";



        String CREATE_EXERCISE_TABLE = "CREATE TABLE exercises (e_ID INTEGER PRIMARY KEY " +
                "AUTOINCREMENT NOT NULL UNIQUE, w_ID INTEGER REFERENCES workouts (ID) " +
                "ON DELETE CASCADE ON UPDATE CASCADE NOT NULL, e_title STRING NOT NULL " +
                "DEFAULT generic, sets INTEGER NOT NULL DEFAULT (- 1), reps INTEGER NOT NULL " +
                "DEFAULT (- 1), weight_used DOUBLE DEFAULT (- 1), pace DOUBLE DEFAULT (- 1), " +
                "duration STRING NOT NULL DEFAULT (- 1), e_date DATE NOT NULL);";

        db.execSQL(CREATE_WORKOUT_TABLE);
        db.execSQL(CREATE_EXERCISE_TABLE);




    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS workouts");
        db.execSQL("DROP TABLE IF EXISTS exercises");
        onCreate(db);
    }

    public void addWorkout(workout my_workout) { //should work, need to create workout object in add workout screen

        ContentValues values = new ContentValues();
        values.put(COLUMN_W_NAME, my_workout.getworkoutTitle());
        values.put(COLUMN_W_DATE, my_workout.get_date());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_WORKOUTS, null, values);
        db.close();
    }

    public ArrayList listExercises(){ //for use with track progress screen, will list all the unique exercises in the db
        ArrayList<String> exerciseTitles = new ArrayList<String>();
        int return_size =0;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select Distinct e_title from exercises;", null);
        return_size = cursor.getCount();
        cursor.moveToFirst();
        for(int i=0; i< return_size; i++){
            exerciseTitles.add(cursor.getString(0));
        }

        return exerciseTitles;

    }


}



