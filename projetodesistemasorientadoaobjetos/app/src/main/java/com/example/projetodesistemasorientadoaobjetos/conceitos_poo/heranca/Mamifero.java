package com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca;

import android.util.Log;

public class Mamifero {
    private static final String TAG = "Mamifero";

    public Mamifero() {}

    public void respirar() {
        Log.d(TAG, "Uma das características dos mamíferos é a respiração.");
    }

}
