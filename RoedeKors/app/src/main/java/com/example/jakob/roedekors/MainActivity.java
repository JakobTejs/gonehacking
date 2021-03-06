package com.example.jakob.roedekors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
    int MYID;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == this.MYID) {
            return true;
        } else if (id == R.id.action_home) {
            Intent myIntent = new Intent(this, HomeActivity.class);
            this.startActivity(myIntent);
            return true;
        } else if (id == R.id.action_doner) {
            Intent myIntent = new Intent(this, DonerActivity.class);
            this.startActivity(myIntent);
            return true;
        } else if (id == R.id.action_frivillig) {
            Intent myIntent = new Intent(this, FrivilligActivity.class);
            this.startActivity(myIntent);
            return true;
        } else if(id == R.id.action_min_side) {
            Intent myIntent = new Intent(this, MinSideActivity.class);
            this.startActivity(myIntent);
            return true;
        } else if (id == R.id.action_indsamler){
            Intent myIntent = new Intent(this, IndsamlerforsideActivity.class);
            this.startActivity(myIntent);
            return true;

        } else if (id == R.id.action_butikker) {
            Intent myIntent = new Intent(this, butikkerActivity.class);
            this.startActivity(myIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
