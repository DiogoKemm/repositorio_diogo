package diogokemmerich.uno.conceitofragments;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends FragmentActivity implements ToolBarFragment.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(int tamanhoFonte, String texto) {
        TextoFragment fragmento = (TextoFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_texto);
        fragmento.trocarPropriedadesDoTexto(tamanhoFonte, texto);
    }
}