package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView texto,resultadoReais,kvh,mes,valorluz;
   /// private Button botao;
    private Spinner menu;
    private EditText numerodePlacas;
    private Switch btnCusto;

    String[] opcoes = {"","GTX 1060","GTX 1070","GTX 1080","RTX 2060","RTX 2070","RTX 2080","RTX 3060","RTX 3070","RTX 3080","RX 580"};

    double hash,consumo,cotaporhash=0.2053,lucrohash,antibuttoncrash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btnCusto = findViewById(R.id.switch1);

        valorluz = findViewById(R.id.valorluzh);

        mes = findViewById(R.id.rendimentoMes);
        texto = findViewById(R.id.hashvalue);
       /// botao = findViewById(R.id.button);
        menu = findViewById(R.id.spinner);
        resultadoReais = findViewById(R.id.resultado);
        numerodePlacas = findViewById(R.id.qntPlacas);
        kvh = findViewById(R.id.enunciadoLuz);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, opcoes);
        menu.setAdapter(adapter);
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (opcoes[i] == opcoes[1]){
                    hash=20.5;
                    consumo = 90.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("20.5 Mh/s");
                }else if(opcoes[i] == opcoes[2]){
                    hash=23.5;
                    consumo = 130.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("23.5 Mh/s");
                }else if(opcoes[i] == opcoes[3]) {
                    hash = 33.5;
                    consumo = 170.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("33.5 Mh/s");
                }else if(opcoes[i] == opcoes[4]) {
                    hash = 31.0;
                    consumo = 120.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("31.0 Mh/s");
                }else if(opcoes[i] == opcoes[5]) {
                    hash = 41.0;
                    consumo = 140.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("41.0 Mh/s");
                }else if(opcoes[i] == opcoes[6]) {
                    hash = 41.0;
                    consumo = 160.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("41.0 Mh/s");
                }else if(opcoes[i] == opcoes[7]) {
                    hash = 35.0;
                    consumo = 110.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("35.0 Mh/s");
                }else if(opcoes[i] == opcoes[8]) {
                    hash = 58.10;
                    consumo = 130.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("58.10 Mh/s");
                }else if(opcoes[i] == opcoes[9]) {
                    hash = 91.50;
                    consumo = 230.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("91.50 Mh/s");
                }else if(opcoes[i] == opcoes[10]) {
                    hash = 30.50;
                    consumo = 130.0;
                    lucrohash= cotaporhash*hash;

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    String valorFormatado = decimal.format(lucrohash);

                    resultadoReais.setText("RS: "+valorFormatado+"/dia");
                    texto.setText("30.50 Mh/s");
                }else{
                    texto.setText("");
                    hash = 0;
                    consumo = 0;
                    lucrohash= 0;
                    resultadoReais.setText("R$: ");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnCusto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    antibuttoncrash=1;
                }else{
                    antibuttoncrash=0;
                }

            }
        });

    }

    public void calcular(View view){
    if(antibuttoncrash==0) {
        double nplacasfuncao = Double.parseDouble(numerodePlacas.getText().toString());

        double consumofinal = ((((consumo * nplacasfuncao) / 1000) * 24 )*30);

        double totalreais = lucrohash * nplacasfuncao;

        double valormes = (totalreais*30);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalreais);
        String valorformatado2 = decimal.format(consumofinal);
        String valorformatado3 = decimal.format(valormes);

        texto.setText(hash * nplacasfuncao + " Mh/s");
        kvh.setText("KWh: " + valorformatado2 + " KWh");
        resultadoReais.setText("RS: " + valorFormatado + "/dia");
        mes.setText("R$: "+valorformatado3+"/mês");
    }else{
        double nplacasfuncao = Double.parseDouble(numerodePlacas.getText().toString());

        double custoluz = Double.parseDouble(valorluz.getText().toString());

        double consumofinal = ((((consumo * nplacasfuncao) / 1000) * 24 )*30);

        double totalreais = (lucrohash * nplacasfuncao);

        double valormes = (totalreais * 30) - (consumofinal * custoluz);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalreais);
        String valorformatado2 = decimal.format(consumofinal);
        String valorformatado3 = decimal.format(valormes);

        texto.setText(hash * nplacasfuncao + " Mh/s");
        kvh.setText("KWh: " + valorformatado2 + " KWh");
        resultadoReais.setText("RS: " + valorFormatado + "/dia");
        mes.setText("R$: "+valorformatado3+"/mês");

    }


    }

}