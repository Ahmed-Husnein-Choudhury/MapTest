package com.example.ahmed.maptest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends android.support.v4.app.Fragment {

    Button toFragment2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        toFragment2=(Button) view.findViewById(R.id.toFragment2);

        toFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void swapFragment(){
        Fragment2 newfragment = new Fragment2();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, newfragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
