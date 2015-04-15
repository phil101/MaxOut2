package com.example.fix_label;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.sagar.prototypeapp.R;



public class Home_Screen extends ActionBarActivity {

    public void buttonOnClick(View view)
    {
        Button button = (Button) view;
        //((Button) view).setText("Coooool");
        startActivity(new Intent(Home_Screen.this,select_exercise_type.class )); //create workout

    }

    public void buttonOnClickView(View view)
    {
        Button button = (Button) view;
        startActivity(new Intent(Home_Screen.this,edit_workout.class )); //view exercise

    }

    public void buttonOnClickEdit(View view)
    {
        Button button = (Button) view;
        startActivity(new Intent(Home_Screen.this,view_workouts.class ));  //edit exercise

    }

    public void buttonOnClickTrack(View view)
    {
        Button button = (Button) view;
        startActivity(new Intent(Home_Screen.this,track_progress.class ));  //track progress

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__screen);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
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
