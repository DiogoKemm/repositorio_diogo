package com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.polimorfismo;

import android.util.Log;

public class Veiculo {
    private static final String TAG = "Veiculo";

    public Veiculo() {}

    public void ligar() {
        Log.d(TAG, "Ligando o veículo...");
    }

    public void acelerar() {
        Log.d(TAG, "Acelerando o veículo...");
    }

}
