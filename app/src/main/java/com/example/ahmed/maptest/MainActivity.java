package com.example.ahmed.maptest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toFragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toFragment1=(Button) findViewById(R.id.toFragment1);

        toFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Fragment1 selected=new Fragment1();
//                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();

            goToFragment(new Fragment1(),false);
            }
        });
    }

    private void goToFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (addToBackStack) {
            transaction.addToBackStack(null);
        }

        transaction.replace(R.id.container, fragment).commit();
    }

    private void showFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
//                .addToBackStack("my_fragment")
                .commit();
    }

}
