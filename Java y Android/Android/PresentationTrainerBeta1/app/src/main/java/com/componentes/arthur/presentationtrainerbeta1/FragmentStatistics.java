package com.componentes.arthur.presentationtrainerbeta1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentStatistics.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentStatistics#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentStatistics extends Fragment {
    private TextView datos;
    private Cursor c = null;
    private  String buffer = "";
    SQLiteDatabase db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_statistics, container, false);
        datos = view.findViewById(R.id.IdLista);
        MisTablas misTablas = new MisTablas(view.getContext());
        db = misTablas.getWritableDatabase();

        if (db != null) {
            c = db.rawQuery("SELECT puntuacion, fecha FROM puntuacion ORDER BY ID DESC LIMIT 10", null);
            if (c.moveToFirst()) {
                do {
                    int puntuacion  = c.getInt(0);
                    String fecha = c.getString(1);
                    buffer += puntuacion +" , "+fecha+"\r\n";
                } while(c.moveToNext());
            }
        }
        datos.setText(buffer, TextView.BufferType.EDITABLE);
        return view;
    }
}
