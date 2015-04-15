package com.example.fix_label;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.sagar.prototypeapp.R;

public class select_exercise_type extends ActionBarActivity {



    public void GoHomeCreateExercise(View view)      //go home
    {
        Button button = (Button) view;
        finish();

    }

    public void weightSelected(View view)        //if type weight is selected
    {
        Button button = (Button) view;
        //((Button) view).setText("Coooool");
        startActivity(new Intent(select_exercise_type.this,add_weight_exercise.class )); //create workout

    }

    public void BweightSelected(View view)        //if type Body weight is selected
    {
        Button button = (Button) view;
        //((Button) view).setText("Coooool");
        startActivity(new Intent(select_exercise_type.this,add_bw_exercise.class )); //create workout

    }

    public void CardioSelected(View view)        //if type cardio is selected
    {
        Button button = (Button) view;
        //((Button) view).setText("Coooool");
        startActivity(new Intent(select_exercise_type.this,add_cardio_exercise.class )); //create workout

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_exercise_type);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_exercise_type, menu);
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
