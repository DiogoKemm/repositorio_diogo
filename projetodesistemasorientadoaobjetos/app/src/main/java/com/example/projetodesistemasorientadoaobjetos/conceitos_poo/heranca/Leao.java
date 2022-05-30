package com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca;

import android.util.Log;

public class Leao extends Mamifero {
    private static final String TAG = "Leao";

    public Leao() {}

    public void rugir() {
        Log.d(TAG, "O leão está rugindo.");
    }

}
