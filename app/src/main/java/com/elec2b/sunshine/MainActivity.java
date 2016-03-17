package com.elec2b.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container,  new ForecastFragment())
                    .commit();
        }

//        PlaceholderFragment test = new PlaceholderFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, test).commit();

    }
}
