package ramos.s.j.mauricio.uno.calcular;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static final String DIVIDIR     = "Dividir";
    public static final String MULTIPLICAR = "Multiplicar";
    public static final String SOMAR       = "Somar";
    public static final String SUBTRAIR    = "Subtrair";
    private TextView tvResultado;
    private Spinner spiOpcoes;
    private EditText edtNumero1, edtNumero2;
    private ImageView imgOperacao;
    private Button btnCalular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Calcular");
        }


        tvResultado = findViewById(R.id.tvResultado);
        spiOpcoes   = findViewById(R.id.spiOpcoes);
        edtNumero1  = findViewById(R.id.edtNumero1);
        edtNumero2  = findViewById(R.id.edtNumero2);
        imgOperacao = findViewById(R.id.imgOperacao);
        btnCalular  = findViewById(R.id.btnCalcular);

        imgOperacao.setVisibility(View.INVISIBLE);


        ArrayAdapter<String> adapterOperacoes = new ArrayAdapter<String>(this
                ,android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOperacoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOperacoes);
        spiOpcoes.setOnItemSelectedListener(this);//Usada como argumento do método.



        btnCalular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();

                if(operacaoSelecionada == DIVIDIR){

                    //tvResultado.setText("teste");

                }else  if(operacaoSelecionada == MULTIPLICAR){

                }else if(operacaoSelecionada.equals(SOMAR)){

                    tvResultado.setText(somar());

                }else if(operacaoSelecionada == SUBTRAIR){

                }

            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

        if(adapterView.getItemAtPosition(i).toString().equals(DIVIDIR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            int n1 = Integer.valueOf(edtNumero1.getText().toString());
            int n2 = Integer.valueOf(edtNumero2.getText().toString());
            int res = n1/n2;
            tvResultado.setText(String.valueOf(res));

        } else if(adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            int n1 = Integer.valueOf(edtNumero1.getText().toString());
            int n2 = Integer.valueOf(edtNumero2.getText().toString());
            int res = n1*n2;
            tvResultado.setText(String.valueOf(res));

        } else if(adapterView.getItemAtPosition(i).toString().equals(SOMAR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);


        } else if(adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            int n1 = Integer.valueOf(edtNumero1.getText().toString());
            int n2 = Integer.valueOf(edtNumero2.getText().toString());
            int res = n1-n2;
            tvResultado.setText(String.valueOf(res));

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private String somar(){
        String resultado = "";

        int n1 = Integer.valueOf(edtNumero1.getText().toString());
        int n2 = Integer.valueOf(edtNumero2.getText().toString());
        int res = n1+n2;
        
        return resultado;
    }


}