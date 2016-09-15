package pe.pedro.aplicacion2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alumno on 7/09/16.
 */
public class BienvenidaActivity extends AppCompatActivity{

    public static final String ARG_NAME ="name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitybienvenida);

        final TextView TxtBienvenida =  (TextView) findViewById(R.id.Text_Bievenido);
        final String nombre=getIntent().getStringExtra(ARG_NAME);

        TxtBienvenida.setText(getString(R.string.Texto_Bienvenida,nombre));
    }
}
