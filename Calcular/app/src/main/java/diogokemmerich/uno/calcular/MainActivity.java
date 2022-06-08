package diogokemmerich.uno.calcular;

import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

@@ -59,25 +59,26 @@ public class MainActivity extends AppCompatActivity implements AdapterView.OnIte
        spiOpcoes.setAdapter(adapterOperacoes);
        spiOpcoes.setOnItemSelectedListener(this);//Usada como argumento do método.

        String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();


        btnCalular.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

        String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();

        if(operacaoSelecionada == DIVIDIR){

        }
        //tvResultado.setText("teste");

        if(operacaoSelecionada == MULTIPLICAR){
        }else  if(operacaoSelecionada == MULTIPLICAR){

        }
        }else if(operacaoSelecionada.equals(SOMAR)){

        if(operacaoSelecionada == SOMAR){
        tvResultado.setText(somar());

        }
        }else if(operacaoSelecionada == SUBTRAIR){

        if(operacaoSelecionada == SUBTRAIR){
        }

        }
@ -88,23 +89,36 @@ public class MainActivity extends AppCompatActivity implements AdapterView.OnIte

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            //Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

            if(adapterView.getItemAtPosition(i).toString().equals(DIVIDIR)){
                imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
                imgOperacao.setVisibility(View.VISIBLE);
                int n1 = Integer.valueOf(edtNumero1.getText().toString());
                int n2 = Integer.valueOf(edtNumero2.getText().toString());
                int res = n1/n2;
                tvResultado.setText(String.valueOf(res));

            }else if(adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)){
                imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
                imgOperacao.setVisibility(View.VISIBLE);
                int n1 = Integer.valueOf(edtNumero1.getText().toString());
                int n2 = Integer.valueOf(edtNumero2.getText().toString());
                int res = n1*n2;
                tvResultado.setText(String.valueOf(res));

            }else if(adapterView.getItemAtPosition(i).toString().equals(SOMAR)){
                imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
                imgOperacao.setVisibility(View.VISIBLE);


            }else if(adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)){
                imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
                imgOperacao.setVisibility(View.VISIBLE);
                int n1 = Integer.valueOf(edtNumero1.getText().toString());
                int n2 = Integer.valueOf(edtNumero2.getText().toString());
                int res = n1-n2;
                tvResultado.setText(String.valueOf(res));

            }
        }
@ -114,5 +128,17 @@ public class MainActivity extends AppCompatActivity implements AdapterView.OnIte

    }

private String somar(){
        String resultado = "";

        int n1 = Integer.valueOf(edtNumero1.getText().toString());
        int n2 = Integer.valueOf(edtNumero2.getText().toString());
        int res = n1+n2;



        return resultado;
        }


        }