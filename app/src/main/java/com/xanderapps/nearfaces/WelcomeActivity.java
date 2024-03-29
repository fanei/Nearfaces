package com.xanderapps.nearfaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }




    public void welcome (View view) {
        Intent help = new Intent (this, FirstSteps.class );
        startActivity(help);
    }

    //public void about (View view) {
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.help_me) {
            Intent help = new Intent (this, AboutActivity.class );
            startActivity(help);
           // overridePendingTransition (R.anim.transition, R.anim.transition);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
