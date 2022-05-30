package com.example.projetodesistemasorientadoaobjetos;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class RespostaActivity extends AppCompatActivity {

    private Button btnResposta;
    private TextView tvExibirResposta;
    private EditText edtResposta;
    private ImageButton imgLimparResposta;
    private static final int REQUEST_CODE = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        btnResposta = findViewById(R.id.btnResposta);
        tvExibirResposta = findViewById(R.id.tvExibirResposta);
        edtResposta = findViewById(R.id.edtResposta);
        imgLimparResposta = findViewById(R.id.imgLimparResposta);

        Bundle extras = getIntent().getExtras();
        String pergunta = "";
        if(extras != null) {
            pergunta = extras.getString("Pergunta");
            String resposta = extras.getString("Resposta");
            if(resposta != null){
                if(!resposta.isEmpty()){
                    edtResposta.setText(resposta);
                }
            }
        }

        btnResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtResposta.getText().toString().isEmpty()){
                    Intent intent = new Intent(RespostaActivity.this, MainActivity.class);
                    String myString = edtResposta.getText().toString();
                    intent.putExtra("Pergunta", myString);
                    startActivityForResult(intent, REQUEST_CODE);
                } else {
                    Toast.makeText(RespostaActivity.this, "Por favor, digite uma pergunta", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imgLimparResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void finish() {
       Intent data = new Intent();

       String returnString = edtResposta.getText().toString();
       data.putExtra("returnData", returnString);

       setResult(RESULT_OK, data);
       super.finish();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:{
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
