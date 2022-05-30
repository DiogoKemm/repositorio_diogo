package com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.polimorfismo;

import android.util.Log;

import com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.abstracao.IMotor;

public class Motocicleta extends Veiculo implements IMotor {
    public Motocicleta() {}

    private static final String TAG = "Motocicleta";

    @Override
    public void ligar() {
        Log.d(TAG, "Ligando moto...");
    }

    @Override
    public void acelerar() {
        Log.d(TAG, "Acelerando moto...");
    }

    @Override
    public String getModelo() {
        return "O motor possui da moto 4 cilindros.";
    }
    @Override
    public String getFabricante() {
        return "O fabricante da moto é americano.";
    }
}
