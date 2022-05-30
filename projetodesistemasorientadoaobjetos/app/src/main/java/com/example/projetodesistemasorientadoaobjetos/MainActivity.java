package com.example.projetodesistemasorientadoaobjetos;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 5;
    private Button btnPergunta;
    private TextView tvExibirResposta, tvInformacao;
    private EditText edtPergunta;
    private ImageButton imgLimparPergunta;
    private ActivityResultLauncher<Intent> activityResultLauncher;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Activity de perguntas");
        }

        btnPergunta         = findViewById(R.id.btnPergunta);
        tvExibirResposta    = findViewById(R.id.tvExibirResposta);
        edtPergunta         = findViewById(R.id.edtPergunta);
        imgLimparPergunta   = findViewById(R.id.imgLimparPergunta);
        tvInformacao        = findViewById(R.id.tvInformacao);

        tvInformacao.setVisibility(View.INVISIBLE);

        btnPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtPergunta.getText().toString().isEmpty()){
                    Intent intent = new Intent(MainActivity.this, RespostaActivity.class);

                    String myString = edtPergunta.getText().toString();
                    intent.putExtra("Pergunta", myString);

                    if(!tvExibirResposta.getText().toString().isEmpty()){
                        String myResposta = tvExibirResposta.getText().toString();
                        intent.putExtra("Resposta", myResposta);
                    }

                    startActivityForResult(intent, REQUEST_CODE);
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, digite uma pergunta", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imgLimparPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtPergunta.setText("");
                //tvInformacao;
            }
        });
    }
}