package com.example.ejercicio06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private TextView txt;
private ListView Lista;
private String productos[] = {"Computadora","Mouse","Hojas","Lapices","Lentes","Reloj","Calculadora","Celular","Mesa","Refrigerador","Horno","Audifonos"};
private String categoria[] = {"Electronica","Dulceria","Papeleria","Moda","Perfumeria","Hogar","Electrodomesticos","Electronica"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.textView);
        Lista =(ListView)findViewById(R.id.Lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,productos);
        Lista.setAdapter(adapter);

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txt.setText("Categoria elegido: "+categoria[position]);
            }
        });
        }
    }

