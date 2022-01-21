package com.example.sorteadornumerico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void sortearNumero(View view){

        TextView resultado = findViewById(R.id.txt_resultado);

        // Utilizado o Random para gerar numeros aleatorios e o nextInt para criar um intervalo entre 0 e 30
        int numero_Sorteado = new Random().nextInt(31);
        resultado.setText("O numero sorteado foi: " + numero_Sorteado);
    }
}