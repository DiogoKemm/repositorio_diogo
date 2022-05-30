package com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.polimorfismo;

import android.util.Log;

import com.example.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.abstracao.IMotor;

public class Carro extends Veiculo implements IMotor {
    public Carro() {}

    private static final String TAG = "Carro";

    public void ligar() {
        super.ligar();
        Log.d(TAG, "Ligando carro...");
    }
    public void acelerar() {
        Log.d(TAG, "Acelerando carro...");
    }

    @Override
    public String getFabricante() {
       return "O fabricante do carro é americano.";
    }

    @Override
    public String getModelo() {
        return "O motor do carro possui 4 cilindros.";
    }
}
