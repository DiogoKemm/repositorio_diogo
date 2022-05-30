package com.example.projetodesistemasorientadoaobjetos.layoutviacodigo;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramarLayout extends AppCompatActivity {
    private static final int BTN_PRESSIONAR_BOTAO_ID = 125470;
    private static final int EDT_NOME_ID = 125479;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // NÃO será usado o layout XML
        // setContentView(R.layout.activity_programar_layout);

        // O Botão é instanciado 1º p/ podeer ser incluido no layout
        Button btnPressionar = new Button(this);

        RelativeLayout layoutAct = new RelativeLayout(this);

        // Define a cor de fundo do layout
        layoutAct.setBackgroundColor((Color.BLUE));

        //Define o texto e cor de fundo do botão
        btnPressionar.setText("Pressione") ;
        btnPressionar.setBackgroundColor(Color.YELLOW);

        final EditText edtNome = new EditText(this);

        //Usando IDs View. Foi criado previamente o arquivo de resource id.xml
        btnPressionar.setId(BTN_PRESSIONAR_BOTAO_ID);
        edtNome.setId(ProgramarLayout.EDT_NOME_ID);
        edtNome.setFocusable(false);
        edtNome.setClickable(false);
        edtNome.setCursorVisible(false);
        edtNome.setGravity(Gravity.CENTER);
        edtNome.setBackgroundColor(Color.WHITE);

        //Definir altura(height) e largura(width) do botão(widget) p/ armazenar o conteúdo
        RelativeLayout.LayoutParams parametrosBtnPressionar = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        //Centralizar botão dentro do layout
        parametrosBtnPressionar.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parametrosBtnPressionar.addRule(RelativeLayout.CENTER_VERTICAL);

        //Definir altura(height) e largura(width) do EditText(widget) p/ armazenar o conteúdo
        RelativeLayout.LayoutParams parametrosEdtNome = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        //Posiciona o edtNome acima do botão que está centralizado
        parametrosEdtNome.addRule(RelativeLayout.ABOVE, btnPressionar.getId());
        parametrosEdtNome.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parametrosEdtNome.setMargins(0, 0, 0, 80);

        //Atenção p/ não vincular uma View + de uma vez no código p/ não gerar a exceção:
        //The specified child already has a parent. You must call removeView() on the child's parent first.
        layoutAct.addView(btnPressionar, parametrosBtnPressionar);
        layoutAct.addView(edtNome, parametrosEdtNome);

        //Uma outra forma de informar ao layout o widget\parametros
        //btnPressionar.setLayoutParams(parametrosBtnPressionar);

        //Converter dp em px
        Resources r = getResources();
        int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());

        edtNome.setWidth(pixels);

        setContentView(layoutAct);

        btnPressionar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                LocalDateTime hoje = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                edtNome.setText(hoje.format(formatter));
            }
        });
    }
}