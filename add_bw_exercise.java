package com.example.fix_label;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sagar.prototypeapp.R;


public class add_bw_exercise extends ActionBarActivity {


    public void GoHomeBweight(View view)       //go home
    {
        Button button = (Button) view;
        finish();

    }


    public void add_bw_exercise(View view){
        Button button = (Button) view;
        //read in the values here, generate the object here, then call addExercise(my_exercise)
        EditText nameBox;
        EditText repsBox;
        EditText setsBox;
        nameBox = (EditText) findViewById(R.id.bwName); //finds location of inputted text
        repsBox = (EditText) findViewById(R.id.exreps);
        setsBox = (EditText) findViewById(R.id.sets);
        exercise my_exercise = new exercise();

        //Need to find a way to set the w_id based on the workout that called the create exercise function.
        my_exercise.set_title(nameBox.getText().toString()); //generates exercise object
        my_exercise.set_reps(Integer.parseInt(repsBox.getText().toString()));
        my_exercise.set_sets(Integer.parseInt(setsBox.getText().toString()));

        databaseInterface db = new databaseInterface(this, null, null, 1);

        db.addExercise(my_exercise);
        nameBox.setText("");
        repsBox.setText("");
        setsBox.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bw_exercise);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_bw_exercise, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
