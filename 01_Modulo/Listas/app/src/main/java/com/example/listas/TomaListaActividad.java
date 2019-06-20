package com.example.listas;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listas.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class TomaListaActividad extends AppCompatActivity {
    //variables
    int actual = 0;
    //componentes
    FloatingActionButton floatingActionButton;
    FloatingActionButton floatingActionButton2;
    TextView txtAlumno;
    TextView txtEstado;
    ImageView avatar;

    List<Alumno> salon = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toma_lista_actividad);

        ///Inicializar los componentes
        floatingActionButton = (FloatingActionButton) findViewById(R.id.faAnterior);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.faSiguiente);
        txtAlumno = (TextView) findViewById(R.id.txtNombreCurso);
        txtEstado = (TextView) findViewById(R.id.txtEstado);
        avatar = (ImageView) findViewById(R.id.imgCurso);
        //Dummy de datos
        salon.add(new Alumno("16061123","Cristian Ernesto"));
        salon.add(new Alumno("16061197","Eugenio juarez"));
        salon.add(new Alumno("160611162","Oswaldo neva"));
        salon.add(new Alumno("160611223", "Raymundo"));
    }
    @Override
    protected  void onResume(){
        super.onResume();
    }
    private void  actualizaVista(){
        if (actual==0)floatingActionButton.hide();
        else floatingActionButton2.show();
        if (actual==salon.size()-1)
    }
    public void justificar(View v){
        Log.i("Lista","Justificar");
    }
    public void falta(View v){
        Log.i("Lista","Falta");
    }
    public void asistencia(View v){
        Log.i("Lista","Asistencia");
    }
    public void anterior(View v){
        Log.i("Lista","Anterior");
    }
    public void siguiente(View v){
        Log.i("Lista","Siguiente");
    }
    }

