package pe.pedro.miservicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.BtnStarService).setOnClickListener(this);
        findViewById(R.id.BtnStopService).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.BtnStarService:
                startServicee();
                break;
            case R.id.BtnStopService:
                stopServicee();
                break;
        }
    }


    private void startServicee(){
        startService(new Intent(this, Servicio.class));

    }

    private void stopServicee(){
        stopService(new Intent(this, Servicio.class));
    }
}
