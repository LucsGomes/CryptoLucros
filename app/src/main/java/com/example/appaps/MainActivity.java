package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button botao;
    private Spinner menu;

    String[] opcoes = {"","GTX 1060","GTX 1070","GTX 1080","RTX 2060","RTX 2070","RTX 2080","RTX 3060","RTX 3070","RTX 3080","RX 580"};

    double hash,consumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.hashvalue);
        botao = findViewById(R.id.button);
        menu = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, opcoes);
        menu.setAdapter(adapter);
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (opcoes[i] == opcoes[1]){
                    hash=20.5;
                    consumo = 90.0;
                    texto.setText("20.5");
                }else if(opcoes[i] == opcoes[2]){
                    hash=23.5;
                    consumo = 130.0;
                    texto.setText("23.5");
                }else if(opcoes[i] == opcoes[3]) {
                    hash = 33.5;
                    consumo = 170.0;
                    texto.setText("33.5");
                }else if(opcoes[i] == opcoes[4]) {
                    hash = 31.0;
                    consumo = 120.0;
                    texto.setText("31.0");
                }else if(opcoes[i] == opcoes[5]) {
                    hash = 41.0;
                    consumo = 140.0;
                    texto.setText("41.0");
                }else if(opcoes[i] == opcoes[6]) {
                    hash = 41.0;
                    consumo = 160.0;
                    texto.setText("41.0");
                }else if(opcoes[i] == opcoes[7]) {
                    hash = 35.0;
                    consumo = 110.0;
                    texto.setText("35.0");
                }else if(opcoes[i] == opcoes[8]) {
                    hash = 58.10;
                    consumo = 130.0;
                    texto.setText("58.10");
                }else if(opcoes[i] == opcoes[9]) {
                    hash = 91.50;
                    consumo = 230.0;
                    texto.setText("91.50");
                }else if(opcoes[i] == opcoes[10]) {
                    hash = 30.50;
                    consumo = 130.0;
                    texto.setText("30.50");
                }else{
                    texto.setText("");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}