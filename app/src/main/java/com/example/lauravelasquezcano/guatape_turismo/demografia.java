package com.example.lauravelasquezcano.guatape_turismo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class demografia extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demografia);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_demografia, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id) {
            case R.id.m_publicidad:
                Intent a = new Intent(this, publicidad.class);
                startActivity(a);
                break;
            case R.id.m_hoteles:
                Intent b = new Intent(this, hoteles.class);
                startActivity(b);
                break;
            case R.id.m_bares:
                Intent c = new Intent(this, bares.class);
                startActivity(c);
                break;
            case R.id.m_sitios_turisticos:
                Intent d = new Intent(this, sitios_turisticos.class);
                startActivity(d);
                break;
            case R.id.m_acerca_de:
                Intent e = new Intent(this, acerca_de.class);
                startActivity(e);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
