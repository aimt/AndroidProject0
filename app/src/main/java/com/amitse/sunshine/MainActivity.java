package com.amitse.sunshine;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button buttonSpotifyStreamer = (Button) this.findViewById(R.id.buttonSpotifyStreamer);
        buttonSpotifyStreamer.setOnClickListener(new listen());

        Button buttonBuildItBigger = (Button) this.findViewById(R.id.buttonBuildItBigger);
        buttonBuildItBigger.setOnClickListener(new listen());

        Button buttonCapstone = (Button) this.findViewById(R.id.buttonCapstone);
        buttonCapstone.setOnClickListener(new listen());
        Button buttonLibraryApp = (Button) this.findViewById(R.id.buttonLibraryApp);
        buttonLibraryApp.setOnClickListener(new listen());
        Button buttonScoresApp = (Button) this.findViewById(R.id.buttonScoresApp);
        buttonScoresApp.setOnClickListener(new listen());

        Button buttonXYZReader = (Button) this.findViewById(R.id.buttonXYZReader);
        buttonXYZReader.setOnClickListener(new listen());

    }

    class listen implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String text  = ((Button)v).getText().toString();
            showToast("Clicked Button" + text);
        }
        public void showToast(String message){
            Context context = getApplicationContext();
            CharSequence text = message;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
    }
}
