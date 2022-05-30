package diogokemmerich.uno.conceitofragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

import javax.xml.namespace.QName;

public class ToolBarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private EditText edtInformarTexto;
    private SeekBar skbFormatarTexto;
    private Button btnAlterarTexto;
    private ToolbarListener ToolbarListener;
    private static int TextSize = 10;

    public interface ToolbarListener {
        public void onButtonClick(int position, String texto);
    }

    public ToolBarFragment() {
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
       View toolBarLayoutInflated = inflater.inflate(R.layout.fragment_tool_bar, container, false);

        edtInformarTexto    = toolBarLayoutInflated.findViewById(R.id.edtInformarTexto);
        skbFormatarTexto    = toolBarLayoutInflated.findViewById(R.id.skbFormatarTexto);
        btnAlterarTexto     = toolBarLayoutInflated.findViewById(R.id.btnAlterarTexto);

        btnAlterarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });

        skbFormatarTexto.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this);

        return toolBarLayoutInflated;
    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            ToolbarListener = (ToolbarListener) context;
        } catch(ClassCastException e) {
            throw new ClassCastException(context.toString()
                + "Obrigatório implementar a interface ToolbarListener");
        }
    }

    public void buttonClicked(View view) {
        ToolbarListener.onButtonClick(TextSize, edtInformarTexto.getText().toString());
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
