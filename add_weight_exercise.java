package com.example.fix_label;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.sagar.prototypeapp.R;



public class add_weight_exercise extends ActionBarActivity {
    Context context;
    //dbAdapter db =  new dbAdapter(getApplicationContext());
    SQLiteDatabase sqlitedatabase;
    //dbAdapter dbHandler;
    //Workout workout;
    // List<Workout> Workouts = new ArrayList<Workout>();



    public void buttonOnClick2(View view)       //go home
    {
        Button button = (Button) view;
        //startActivity(new Intent(MainActivity2.this,MainActivity.class ));
        finish();

    }

    // dbAdapter db =  new dbAdapter(this);

    public void save(View v)
    {
        EditText nametxt =(EditText)findViewById(R.id.exname);
        EditText reptxt =(EditText)findViewById(R.id.exreps);
        EditText weighttxt =(EditText)findViewById(R.id.exweight);
        EditText setstxt =(EditText)findViewById(R.id.sets);


        /*String name = nametxt.getText().toString();
        String rep = reptxt.getText().toString();
        String weight = weighttxt.getText().toString();
        String time = timetxt.getText().toString();


        Workout workout = new Workout(dbHandler.getCount(),String.valueOf(nametxt.getText()),String.valueOf(reptxt.getText()),String.valueOf(weighttxt.getText()),String.valueOf(timetxt.getText()));
        Workout workout = new Workout(dbHandler.getCount(),String.valueOf(name),String.valueOf(rep),String.valueOf(weight),String.valueOf(time));
        dbHandler.insert(workout);
        Workouts.add(workout);
        populateList();*/






       /* dbadapter = new dbAdapter(context);
        sqlitedatabase = dbadapter.getWritableDatabase();
        dbadapter.insertRecord(name,type,rep,weight,sqlitedatabase);


        db.open();

        long id = db.insertRecord(name, type,rep,weight);

        db.close();*/






        Toast.makeText(add_weight_exercise.this,nametxt.getText().toString() + " has been saved!",Toast.LENGTH_LONG).show();

        nametxt.setText("");
        reptxt.setText("");
        weighttxt.setText("");
        setstxt.setText("");



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_weight_exercise);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_weight_exercise, menu);
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
