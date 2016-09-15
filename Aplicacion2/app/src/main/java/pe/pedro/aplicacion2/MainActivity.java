package pe.pedro.aplicacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //implements View.OnClickListener FORMA 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BtnEntrar =(Button)findViewById(R.id.cmdEntrar);
        final TextView TxtNombre =(TextView)findViewById(R.id.txtnombre);


        BtnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nombre= TxtNombre.getText().toString();
                final Intent BienvenidaIntent =new Intent(MainActivity.this, BienvenidaActivity.class);
                BienvenidaIntent.putExtra(BienvenidaActivity.ARG_NAME,nombre);

                startActivity(BienvenidaIntent);

            }
        });
        /* FORMA 2
        TxtNombre.setOnClickListener(this);
        */

        /* FORMA 3 me da hasta las coordenadas el evento ontouch
        BtnEntrar.setOnTouchListener(new View.OnTouchListener() {
          @Override
          public boolean onTouch(View v, MotionEvent event) {
                 return false;
          }
        });
        */

    }

    /* FORMA 2
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.cmdEntrar:
                break;
        }
    }
*/
}
