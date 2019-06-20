package com.example.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.listas.modelo.Cursos;

import java.util.Currency;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rv =(RecyclerView)findViewById(R.id .rv);
        llenarrecicle();
    }
    private void llenarrecicle(){
        Cursos  cursos1 = new Cursos();
        Cursos cursos2 = new Cursos();
        Cursos cursos3 = new Cursos();
        cursos1.setNombre("resumen");
        cursos1.setId(1);
        cursos1.setPorcentaje(20);
        cursos2.setNombre("Base de datos");
        cursos2.setId(2);
        cursos2.setPorcentaje(30);
        cursos3.setNombre("Desarrollo web");
        cursos3.setPorcentaje(30);

        List<Cursos> lista;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuprincipal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.sincronizar:
                Log.i("Menu","SYNC");
                break;
            case R.id.add_curso:
                Log.i("Menu","CURSO");
                break;
            case R.id.add_alumno:
                Log.i("MENU","ALUMNO");
        }
        return super.onOptionsItemSelected(item);
    }
}
