package com.componentes.arthur.presentationtrainerbeta1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentData.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentData#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentData extends Fragment{
    Button nextApp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_data, container, false);
        nextApp = view.findViewById(R.id.IdMostrarDispositivos);
        nextApp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent sig = new Intent(v.getContext(),DispositivosBT.class);
                startActivity(sig);

            }
        });
        return view;
    }
}
