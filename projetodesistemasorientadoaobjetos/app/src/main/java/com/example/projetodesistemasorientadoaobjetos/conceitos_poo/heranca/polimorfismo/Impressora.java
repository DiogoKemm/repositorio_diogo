package com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.polimorfismo;

import android.util.Log;

import com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Leao;

public class Impressora {
    private final int ano = 2022;

    public Impressora() {}

    private static final String TAG = "Impressora";

    public void imprimir(int numeroInteiro) {
        Log.d(TAG, "Imprime números inteiros: " + new Leao());
        /*if(numeroInteiro != (int)numeroInteiro) {
            System.out.println("Test");
        }*/
    }

    public void imprimir(String texto) {
        Log.d(TAG, "Imprime a cadeia de caracteres: " + texto);

    }

    public void imprimir(double numeroDecimal) {
        Log.d(TAG, "Imprime números decimais: " + numeroDecimal);

    }
}
