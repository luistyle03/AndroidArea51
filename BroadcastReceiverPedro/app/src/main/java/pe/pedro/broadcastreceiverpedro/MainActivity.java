package pe.pedro.broadcastreceiverpedro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BtnEntrar =(Button)findViewById(R.id.BtnBroadcast);

        findViewById(R.id.BtnBroadcast).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                final Intent ButtonClickedIntent =new Intent(Broadcastreceiverpedro.ACTION_BUTTON_CLICKED);
                sendBroadcast(ButtonClickedIntent);
            }

                                                           }

        );


    }
}
