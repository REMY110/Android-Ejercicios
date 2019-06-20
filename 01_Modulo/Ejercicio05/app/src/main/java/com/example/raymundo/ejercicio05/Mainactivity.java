package com.example.raymundo.ejercicio05;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Mainactivity extends AppCompatActivity {

    EditText editText;
    Spinner spinner;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);

        //buscar componentes

        editText = (EditText) findViewById(R.id.editText2);
        spinner = (Spinner) findViewById(R.id.spinner);

        ///
        String []opciones = {"Negritas","Cursivas","Cursivas y Negritas","Normal"};
        ///Adapter
        ArrayAdapter<String> adaptador =  new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item, opciones);

        //Modelos
            spinner.setAdapter(adaptador);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    String opcion = spinner.getSelectedItem().toString();
                    if (opcion.equals("Negritas"))editText.setTypeface(null, Typeface.BOLD);
                    else if (opcion.equals("Cursivas"))editText.setTypeface(null, Typeface.ITALIC);
                    else if (opcion.equals("Cursivas y Negritas"))editText.setTypeface(null, Typeface.BOLD_ITALIC);
                    else if (opcion.equals("Normal"))editText.setTypeface(null,Typeface.NORMAL);
                    }


                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
    }
}
