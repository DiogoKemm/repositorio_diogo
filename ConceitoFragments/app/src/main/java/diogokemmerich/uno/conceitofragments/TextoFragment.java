package diogokemmerich.uno.conceitofragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextoFragment extends Fragment {

    private TextView tvDigite;

    public TextoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View textInflated = inflater.inflate(R.layout.fragment_texto, container, false);

       tvDigite = textInflated.findViewById(R.id.tvDigite);

       return textInflated;
    }

    public void trocarPropriedadesDoTexto(int tamanhoFonte, String texto) {
        tvDigite.setTextSize(tamanhoFonte);
        tvDigite.setText(texto);

    }
}