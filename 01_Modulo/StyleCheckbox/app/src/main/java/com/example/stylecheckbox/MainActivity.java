package com.example.stylecheckbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTexto;
    CheckBox Negrita, Cursiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTexto = (EditText) findViewById(R.id.edTexto);
        Negrita = (CheckBox) findViewById(R.id.Negrita);
        Cursiva = (CheckBox) findViewById(R.id.Cursiva);

        Cursiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Cursiva.isChecked() && !Negrita.isChecked()) {
                    edtTexto.setTypeface(null, Typeface.ITALIC);
                } else if (!Cursiva.isChecked() && Negrita.isChecked()) {
                    edtTexto.setTypeface(null, Typeface.BOLD);
                } else if (Cursiva.isChecked() && Negrita.isChecked()) {
                    edtTexto.setTypeface(null, Typeface.BOLD_ITALIC);
                } else if (!Cursiva.isChecked() && !Negrita.isChecked()) {
                    edtTexto.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
        Negrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        }
        }

